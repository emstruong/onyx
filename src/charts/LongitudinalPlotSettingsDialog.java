package charts;

import java.awt.Color;
import java.util.function.Consumer;

// Stub for an upstream-incomplete dialog. The real implementation never
// landed; this exists so the source compiles. Opening the dialog is a no-op.
public class LongitudinalPlotSettingsDialog {

	public static class PlotSettings {
		public String xAxisLabel = "";
		public String yAxisLabel = "";
		public float lineThickness = 1.0f;
		public LineColorMode lineColorMode = LineColorMode.AUTO;
		public Color lineColor = Color.BLACK;

		public enum LineColorMode {
			AUTO,
			USER_DEFINED
		}
	}

	public LongitudinalPlotSettingsDialog(PlotSettings settings, Consumer<PlotSettings> onApply) {
	}
}
