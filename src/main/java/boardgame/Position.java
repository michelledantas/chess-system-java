package boardgame;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Position {
    private int row;
    private int column;

    @Override
    public String toString() {
        return row + " , " + column;
    }
}
