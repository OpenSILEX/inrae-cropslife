//******************************************************************************
// OpenSILEX - Licence AGPL V3.0 - https://www.gnu.org/licenses/agpl-3.0.en.html
// Copyright © INRA 2019
// Contact: vincent.migot@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
//******************************************************************************
package inrae.cropslife;

import java.util.List;
import org.apache.jena.riot.Lang;
import org.opensilex.OpenSilexModule;
import org.opensilex.sparql.SPARQLConfig;
import org.opensilex.sparql.SPARQLModule;
import org.opensilex.sparql.extensions.OntologyFileDefinition;
import org.opensilex.sparql.extensions.SPARQLExtension;

/**
 * CropsLife module implementation
 */
public class CropsLifeModule extends OpenSilexModule implements SPARQLExtension{

     @Override
     public List<OntologyFileDefinition> getOntologiesFiles() throws Exception {
        List<OntologyFileDefinition> list = SPARQLExtension.super.getOntologiesFiles();        
        SPARQLConfig sparqlConfig = getOpenSilex().getModuleConfig(SPARQLModule.class, SPARQLConfig.class);
         list.add(new OntologyFileDefinition(
                 "http://www.opensilex.org/vocabulary/oeso-agrivoltaics#",
                 "ontologies/oeso-agrivoltaics.owl",
                 Lang.RDFXML,
                 "oeso-agrivoltaics"
         ));
         list.add(new OntologyFileDefinition(
                 "http://www.opensilex.org/vocabulary/oeso-vitis#",
                 "ontologies/oeso-vitis.owl",
                 Lang.RDFXML,
                 "oeso-vitis"
         ));
        
        // list.add(new OntologyFileDefinition(
        //         sparqlConfig.baseURI() + "set/germplasms",
        //         "ontologies/sunagri-species.ttl",
        //         Lang.TTL,
        //         sparqlConfig.baseURIAlias() + "-germplasm"
        // ));
         return list;
     }
}
