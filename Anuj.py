import numpy as np
import matplotlib.pyplot as plt
from matplotlib.animation import FuncAnimation

# Function to perform left rotation
def left_rotate(arr):
    return np.roll(arr, -1)

# Initial array
arr = np.array([1, 2, 3, 4, 5, 6])
n = len(arr)

# Set up the figure and 3D axis
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')

# Function to update the plot
def update(frame):
    ax.clear()
    rotated_arr = left_rotate(arr) if frame > 0 else arr
    ax.bar3d(np.arange(n), np.zeros(n), np.zeros(n), 0.5, 0.5, rotated_arr, shade=True)
    ax.set_ylim(0, 1)
    ax.set_zlim(0, np.max(arr) + 1)
    ax.set_title(f'Left Rotation Step: {frame}')
    ax.set_xlabel('Index')
    ax.set_ylabel('Y-axis (fixed)')
    ax.set_zlabel('Value')

# Create animation
ani = FuncAnimation(fig, update, frames=n, repeat=False)

# Show the animation
plt.show()
