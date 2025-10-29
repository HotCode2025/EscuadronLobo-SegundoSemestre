class Color:
    def __init__(self, color):
        self._color = color
        
    @property
    def color(self): # Método Getter
        return self._color
    
    @color.setter
    def color(self, color): # Método Setter
        self._color = color
    
    def __str__(self):
        return f'Color: [Color: {self._color}]'