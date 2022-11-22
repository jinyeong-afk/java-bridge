package bridge.model;

import bridge.view.InputView;
import java.util.List;

public class JudgeCommand {
    private ExecuteCommand executeCommand;

    public JudgeCommand(GameStatus gameStatus, BridgeMaker bridgeMaker, PresentBridgeMaker presentBridgeMaker) {
        executeCommand = new ExecuteCommand(gameStatus, bridgeMaker, presentBridgeMaker);
    }

    public boolean judgeMove(List<String> bridge, String moveCommand, int bridgeIndex) {
        if (bridge.get(bridgeIndex).equals(moveCommand)) {
            return true;
        }
        return false;
    }

    public boolean judgeContinue() {
        String gameCommand = InputView.readGameCommand();

        if (gameCommand.equals("R")) {
            executeCommand.retry();
            return true;
        }
        return false;
    }
}
