package br.ufc.lps.model.context;

import br.ufc.lps.model.normal.IModel;

public interface IContextModel extends IModel {

	public int numberActivatedFeatures();

	public int numberDeactivatedFeatures();

	public int numberContextConstraints();

	public int numberOfContexts();

	public int numberOfContextAffectingProductConfiguration();

	public int numberOfContextAdaptation();

	public int contextAdaptationExtensibility();

	public int contextAdaptationFlexibility();
}
