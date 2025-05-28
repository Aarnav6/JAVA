import pygame
import random
import math
import sys

# Initialize pygame
pygame.init()

# Window setup
WIDTH, HEIGHT = 800, 600
WIN = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Mini CS: Character Mode")

# Colors and fonts
WHITE = (255, 255, 255)
RED = (255, 0, 0)
GREEN = (0, 255, 0)
BLUE = (50, 150, 255)
BG_COLOR = (30, 30, 30)
FONT = pygame.font.SysFont('consolas', 30)

clock = pygame.time.Clock()

# Player properties
player_size = 40
player_speed = 5
player_pos = pygame.Vector2(WIDTH//2, HEIGHT//2)
player_health = 100
ammo = 6
max_ammo = 6
score = 0

# Enemy properties
enemy_size = 30
enemy_speed = 1.5
enemy_spawn_delay = 1500  # milliseconds
last_enemy_spawn = pygame.time.get_ticks()
enemies = []

# Bullet properties
bullet_speed = 10
bullets = []

def spawn_enemy():
    # Spawn enemy randomly at screen edges
    side = random.choice(['top', 'bottom', 'left', 'right'])
    if side == 'top':
        x = random.randint(0, WIDTH)
        y = -enemy_size
    elif side == 'bottom':
        x = random.randint(0, WIDTH)
        y = HEIGHT + enemy_size
    elif side == 'left':
        x = -enemy_size
        y = random.randint(0, HEIGHT)
    else:  # right
        x = WIDTH + enemy_size
        y = random.randint(0, HEIGHT)

    pos = pygame.Vector2(x, y)
    enemies.append(pos)

def move_enemies():
    global player_health
    to_remove = []
    for enemy_pos in enemies:
        direction = (player_pos - enemy_pos).normalize()
        enemy_pos += direction * enemy_speed

        # Check collision with player
        if enemy_pos.distance_to(player_pos) < (enemy_size + player_size) / 2:
            player_health -= 10
            to_remove.append(enemy_pos)
            print("Enemy hit you! Health -10")

    for enemy in to_remove:
        enemies.remove(enemy)

def move_bullets():
    to_remove = []
    global score
    for bullet in bullets:
        bullet['pos'] += bullet['vel']
        # Remove bullet if off screen
        if not (0 <= bullet['pos'].x <= WIDTH and 0 <= bullet['pos'].y <= HEIGHT):
            to_remove.append(bullet)
            continue
        # Check collision with enemies
        for enemy_pos in enemies:
            if bullet['pos'].distance_to(enemy_pos) < (enemy_size) / 1.5:
                score += 10
                to_remove.append(bullet)
                enemies.remove(enemy_pos)
                break

    for b in to_remove:
        if b in bullets:
            bullets.remove(b)

def draw_window():
    WIN.fill(BG_COLOR)

    # Draw player (blue square)
    pygame.draw.rect(WIN, BLUE, (player_pos.x - player_size/2, player_pos.y - player_size/2, player_size, player_size))

    # Draw enemies (red circles)
    for enemy_pos in enemies:
        pygame.draw.circle(WIN, RED, (int(enemy_pos.x), int(enemy_pos.y)), enemy_size//2)

    # Draw bullets (small green circles)
    for bullet in bullets:
        pygame.draw.circle(WIN, GREEN, (int(bullet['pos'].x), int(bullet['pos'].y)), 6)

    # HUD
    health_text = FONT.render(f"Health: {player_health}", True, WHITE)
    ammo_text = FONT.render(f"Ammo: {ammo}/{max_ammo}", True, WHITE)
    score_text = FONT.render(f"Score: {score}", True, WHITE)
    WIN.blit(health_text, (10, 10))
    WIN.blit(ammo_text, (10, 50))
    WIN.blit(score_text, (10, 90))

    # Crosshair at mouse pos
    mx, my = pygame.mouse.get_pos()
    length = 10
    pygame.draw.line(WIN, GREEN, (mx - length, my), (mx + length, my), 2)
    pygame.draw.line(WIN, GREEN, (mx, my - length), (mx, my + length), 2)

    pygame.display.update()

def handle_player_movement(keys):
    global player_pos
    vel = pygame.Vector2(0, 0)
    if keys[pygame.K_a] or keys[pygame.K_LEFT]:
        vel.x = -player_speed
    if keys[pygame.K_d] or keys[pygame.K_RIGHT]:
        vel.x = player_speed
    if keys[pygame.K_w] or keys[pygame.K_UP]:
        vel.y = -player_speed
    if keys[pygame.K_s] or keys[pygame.K_DOWN]:
        vel.y = player_speed
    player_pos += vel

    # Keep inside window
    player_pos.x = max(player_size/2, min(WIDTH - player_size/2, player_pos.x))
    player_pos.y = max(player_size/2, min(HEIGHT - player_size/2, player_pos.y))

def shoot_bullet(target_pos):
    global ammo
    if ammo <= 0:
        print("Click! No ammo. Reload with R.")
        return
    ammo -= 1
    direction = (pygame.Vector2(target_pos) - player_pos).normalize()
    velocity = direction * bullet_speed
    bullet = {'pos': player_pos.copy(), 'vel': velocity}
    bullets.append(bullet)

def main():
    global player_health, ammo, last_enemy_spawn

    running = True
    while running:
        clock.tick(60)
        keys = pygame.key.get_pressed()

        # Spawn enemies
        current_time = pygame.time.get_ticks()
        if current_time - last_enemy_spawn > enemy_spawn_delay:
            spawn_enemy()
            last_enemy_spawn = current_time

        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False

            # Shoot bullets on left mouse click
            if event.type == pygame.MOUSEBUTTONDOWN and event.button == 1:
                shoot_bullet(pygame.mouse.get_pos())

            # Reload ammo on R key press
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_r:
                    ammo = max_ammo
                    print("Reloaded!")

        handle_player_movement(keys)
        move_enemies()
        move_bullets()

        if player_health <= 0:
            running = False

        draw_window()

    # Game over
    WIN.fill(BG_COLOR)
    game_over_text = FONT.render(f"Game Over! Final Score: {score}", True, WHITE)
    WIN.blit(game_over_text, (WIDTH//2 - game_over_text.get_width()//2, HEIGHT//2))
    pygame.display.update()
    pygame.time.wait(3000)
    pygame.quit()
    sys.exit()


if __name__ == "__main__":
    main()
