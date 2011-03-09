package uk.org.taverna.t3.workbench.ui.util;

import com.google.common.base.Preconditions;

import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

public class CanvasUtil {

	private CanvasUtil() {
		throw new AssertionError();
	}

	public static Component buildComponentFrom(ComponentDefinition cd) {
		Preconditions.checkNotNull(cd);
		
		final Component canvasComponent = CanvasFactory.eINSTANCE.createComponent();
		
		canvasComponent.setLabel(cd.getLabel());
		canvasComponent.setTitle(cd.getTitle());
		

		Processor processorOne = CanvasFactory.eINSTANCE.createProcessor();
		Processor processorTwo = CanvasFactory.eINSTANCE.createProcessor();

		processorOne.setName("A processor");
		processorTwo.setName("Another processor");

		ProcessorInput inputOne = CanvasFactory.eINSTANCE
				.createProcessorInput();
		ProcessorInput inputTwo = CanvasFactory.eINSTANCE
				.createProcessorInput();
		ProcessorInput inputThree = CanvasFactory.eINSTANCE
				.createProcessorInput();
		ProcessorInput inputFour = CanvasFactory.eINSTANCE
				.createProcessorInput();
		ProcessorInput inputFive = CanvasFactory.eINSTANCE
				.createProcessorInput();
		ProcessorInput inputSix = CanvasFactory.eINSTANCE
				.createProcessorInput();

		ProcessorOutput outputOne = CanvasFactory.eINSTANCE
				.createProcessorOutput();
		ProcessorOutput outputTwo = CanvasFactory.eINSTANCE
				.createProcessorOutput();
		ProcessorOutput outputThree = CanvasFactory.eINSTANCE
				.createProcessorOutput();
		ProcessorOutput outputFour = CanvasFactory.eINSTANCE
				.createProcessorOutput();
		ProcessorOutput outputFive = CanvasFactory.eINSTANCE
				.createProcessorOutput();
		ProcessorOutput outputSix = CanvasFactory.eINSTANCE
				.createProcessorOutput();

		processorOne.getProcessorInputs().add(inputOne);
		processorOne.getProcessorInputs().add(inputTwo);
		processorOne.getProcessorInputs().add(inputThree);

		processorOne.getProcessorOutputs().add(outputOne);
		processorOne.getProcessorOutputs().add(outputTwo);
		processorOne.getProcessorOutputs().add(outputThree);

		processorTwo.getProcessorInputs().add(inputFour);
		processorTwo.getProcessorInputs().add(inputFive);
		processorTwo.getProcessorInputs().add(inputSix);

		processorTwo.getProcessorOutputs().add(outputFour);
		processorTwo.getProcessorOutputs().add(outputFive);
		processorTwo.getProcessorOutputs().add(outputSix);

		canvasComponent.getProcessors().add(processorOne);
		canvasComponent.getProcessors().add(processorTwo);
		canvasComponent.setTitle("Component Title");

		return canvasComponent;
	}

}
