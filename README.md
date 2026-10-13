# Informations

## Update for 1.0.2 - 2023-08-04

Migrate from

```sparql
Subject	Predicate	Object	Context
_:genid-f750b96d1e944d62b8623bd80e13845b-b2
owl:someValuesFrom
vocabulary:Germplasm
<http://www.opensilex.org/vocabulary/oeso-sunagri>
_:genid-f750b96d1e944d62b8623bd80e13845b-b2
rdf:type
owl:Restriction
<http://www.opensilex.org/vocabulary/oeso-sunagri>
_:genid-f750b96d1e944d62b8623bd80e13845b-b2
owl:onProperty
vocabulary:hasGermplasm
<http://www.opensilex.org/vocabulary/oeso-sunagri>
vocabulary:Fruit
rdfs:subClassOf
_:genid-f750b96d1e944d62b8623bd80e13845b-b2
<http://www.opensilex.org/vocabulary/oeso-sunagri>

```

to 

``` 

Subject	Predicate	Object	Context
_:genid-07ca199899a14d89b4b2a0520b4e5e8e-36B30B1BAE2DFCEDD06E14E3634577A7
owl:onClass
vocabulary:Germplasm
<http://www.opensilex.org/sunagri/set/properties>
_:genid-07ca199899a14d89b4b2a0520b4e5e8e-36B30B1BAE2DFCEDD06E14E3634577A7
rdf:type
owl:Restriction
<http://www.opensilex.org/sunagri/set/properties>
_:genid-07ca199899a14d89b4b2a0520b4e5e8e-36B30B1BAE2DFCEDD06E14E3634577A7
owl:onProperty
vocabulary:hasGermplasm
<http://www.opensilex.org/sunagri/set/properties>
_:genid-07ca199899a14d89b4b2a0520b4e5e8e-36B30B1BAE2DFCEDD06E14E3634577A7
owl:maxQualifiedCardinality
1	
<http://www.opensilex.org/sunagri/set/properties>
_:genid-07ca199899a14d89b4b2a0520b4e5e8e-36B30B1BAE2DFCEDD06E14E3634577A7
owl:minQualifiedCardinality
0	
<http://www.opensilex.org/sunagri/set/properties>
sunagri:tomatoPlant
rdfs:subClassOf
_:genid-07ca199899a14d89b4b2a0520b4e5e8e-36B30B1BAE2DFCEDD06E14E3634577A7
<http://www.opensilex.org/sunagri/set/properties>

```

SPARQL QUery 

```sparql
PREFIX  oeso: <http://www.opensilex.org/vocabulary/oeso-phis#>
PREFIX  oeso-sunagri: <http://www.opensilex.org/vocabulary/oeso-sunagri#>
PREFIX  sunagri-ScientificApplication: <http://www.opensilex.org/sunagri/set/shinyApps#>
PREFIX  sunagri-person: <http://www.opensilex.org/sunagri/set/user#>
PREFIX  owl:  <http://www.w3.org/2002/07/owl#>
PREFIX  xsd:  <http://www.w3.org/2001/XMLSchema#>
PREFIX  fn:   <http://www.w3.org/2005/xpath-functions#>
PREFIX  sunagri-expe: <http://www.opensilex.org/sunagri/set/experiments#>
PREFIX  oeev-sunagri: <http://www.opensilex.org/vocabulary/oeev-sunagri#>
PREFIX  skos: <http://www.w3.org/2004/02/skos/core#>
PREFIX  rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX  sunagri-prj: <http://www.opensilex.org/sunagri/set/projects#>
PREFIX  sunagri-infra: <http://www.opensilex.org/sunagri/set/infrastructures#>
PREFIX  sunagri-prf: <http://www.opensilex.org/sunagri/profiles#>
PREFIX  sunagri-grp: <http://www.opensilex.org/sunagri/groups#>
PREFIX  oa:   <http://www.w3.org/ns/oa#>
PREFIX  vocabulary: <http://www.opensilex.org/vocabulary/oeso#>
PREFIX  peco: <http://purl.obolibrary.org/obo/peco.owl#>
PREFIX  dcterms: <http://purl.org/dc/terms/#>
PREFIX  sunagri-doc: <http://www.opensilex.org/sunagri/set/documents#>
PREFIX  sunagri-factor: <http://www.opensilex.org/sunagri/set/factors#>
PREFIX  foaf: <http://xmlns.com/foaf/0.1/>
PREFIX  rdf4j: <http://rdf4j.org/schema/rdf4j#>
PREFIX  org:  <http://www.w3.org/ns/org#>
PREFIX  oeso-analysis: <https://www.opensilex.org/vocabulary/oeso/analysis#>
PREFIX  sunagri: <http://www.opensilex.org/sunagri/>
PREFIX  sunagri-ev: <http://www.opensilex.org/sunagri/events#>
PREFIX  sunagri-oowl-ext: <http://www.opensilex.org/sunagri/opensilex-owl-extension#>
PREFIX  vcard: <http://www.w3.org/2006/vcard/ns#>
PREFIX  sunagri-area: <http://www.opensilex.org/sunagri/set/area#>
PREFIX  oeev: <http://www.opensilex.org/vocabulary/oeev#>
PREFIX  sunagri-germplasm: <http://www.opensilex.org/sunagri/set/germplasms#>
PREFIX  sunagri-account: <http://www.opensilex.org/sunagri/set/user#>
PREFIX  rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX  sesame: <http://www.openrdf.org/schema/sesame#>
PREFIX  time: <http://www.w3.org/2006/time#>
PREFIX  os-sec: <http://www.opensilex.org/security#>
PREFIX  sunagri-so: <http://www.opensilex.org/sunagri/set/scientific-objects#>
PREFIX  agrovoc: <http://aims.fao.org/aos/agrovoc/factors#>
PREFIX  sunagri-usr: <http://www.opensilex.org/sunagri/users#>
PREFIX  dc:   <http://purl.org/dc/terms/>
PREFIX  sunagri-device: <http://www.opensilex.org/sunagri/set/devices#>

DELETE{
  GRAPH <http://www.opensilex.org/vocabulary/oeso-sunagri> {
?uri  owl:someValuesFrom vocabulary:Germplasm .
  }
}
INSERT {
  GRAPH <http://www.opensilex.org/vocabulary/oeso-sunagri> {
  ?uri  owl:onClass vocabulary:Germplasm .
  }
}
WHERE {
  GRAPH <http://www.opensilex.org/vocabulary/oeso-sunagri> {
    
 ?uri rdf:type
owl:Restriction .
   ?uri  owl:someValuesFrom
vocabulary:Germplasm .
  }
}
```


## Update rank in stem

```
PREFIX  oeso: <http://www.opensilex.org/vocabulary/oeso-phis#>
PREFIX  oeso-sunagri: <http://www.opensilex.org/vocabulary/oeso-sunagri#>
PREFIX  sunagri-ScientificApplication: <http://www.opensilex.org/sunagri/set/shinyApps#>
PREFIX  sunagri-person: <http://www.opensilex.org/sunagri/set/user#>
PREFIX  owl:  <http://www.w3.org/2002/07/owl#>
PREFIX  xsd:  <http://www.w3.org/2001/XMLSchema#>
PREFIX  fn:   <http://www.w3.org/2005/xpath-functions#>
PREFIX  sunagri-expe: <http://www.opensilex.org/sunagri/set/experiments#>
PREFIX  oeev-sunagri: <http://www.opensilex.org/vocabulary/oeev-sunagri#>
PREFIX  skos: <http://www.w3.org/2004/02/skos/core#>
PREFIX  rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX  sunagri-prj: <http://www.opensilex.org/sunagri/set/projects#>
PREFIX  sunagri-infra: <http://www.opensilex.org/sunagri/set/infrastructures#>
PREFIX  sunagri-prf: <http://www.opensilex.org/sunagri/profiles#>
PREFIX  sunagri-grp: <http://www.opensilex.org/sunagri/groups#>
PREFIX  oa:   <http://www.w3.org/ns/oa#>
PREFIX  vocabulary: <http://www.opensilex.org/vocabulary/oeso#>
PREFIX  peco: <http://purl.obolibrary.org/obo/peco.owl#>
PREFIX  dcterms: <http://purl.org/dc/terms/#>
PREFIX  sunagri-doc: <http://www.opensilex.org/sunagri/set/documents#>
PREFIX  sunagri-factor: <http://www.opensilex.org/sunagri/set/factors#>
PREFIX  foaf: <http://xmlns.com/foaf/0.1/>
PREFIX  rdf4j: <http://rdf4j.org/schema/rdf4j#>
PREFIX  org:  <http://www.w3.org/ns/org#>
PREFIX  oeso-analysis: <https://www.opensilex.org/vocabulary/oeso/analysis#>
PREFIX  sunagri: <http://www.opensilex.org/sunagri/>
PREFIX  sunagri-ev: <http://www.opensilex.org/sunagri/events#>
PREFIX  sunagri-oowl-ext: <http://www.opensilex.org/sunagri/opensilex-owl-extension#>
PREFIX  vcard: <http://www.w3.org/2006/vcard/ns#>
PREFIX  sunagri-area: <http://www.opensilex.org/sunagri/set/area#>
PREFIX  oeev: <http://www.opensilex.org/vocabulary/oeev#>
PREFIX  sunagri-germplasm: <http://www.opensilex.org/sunagri/set/germplasms#>
PREFIX  sunagri-account: <http://www.opensilex.org/sunagri/set/user#>
PREFIX  rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX  sesame: <http://www.openrdf.org/schema/sesame#>
PREFIX  time: <http://www.w3.org/2006/time#>
PREFIX  os-sec: <http://www.opensilex.org/security#>
PREFIX  sunagri-so: <http://www.opensilex.org/sunagri/set/scientific-objects#>
PREFIX  agrovoc: <http://aims.fao.org/aos/agrovoc/factors#>
PREFIX  sunagri-usr: <http://www.opensilex.org/sunagri/users#>
PREFIX  dc:   <http://purl.org/dc/terms/>
PREFIX  sunagri-device: <http://www.opensilex.org/sunagri/set/devices#>

DELETE{ 
sunagri:stemRank ?p ?o 
}
INSERT { 
  sunagri:rankInStem ?p ?o 
}
WHERE { 
 sunagri:stemRank ?p ?o 
}
```


```
PREFIX  oeso: <http://www.opensilex.org/vocabulary/oeso-phis#>
PREFIX  oeso-sunagri: <http://www.opensilex.org/vocabulary/oeso-sunagri#>
PREFIX  sunagri-ScientificApplication: <http://www.opensilex.org/sunagri/set/shinyApps#>
PREFIX  sunagri-person: <http://www.opensilex.org/sunagri/set/user#>
PREFIX  owl:  <http://www.w3.org/2002/07/owl#>
PREFIX  xsd:  <http://www.w3.org/2001/XMLSchema#>
PREFIX  fn:   <http://www.w3.org/2005/xpath-functions#>
PREFIX  sunagri-expe: <http://www.opensilex.org/sunagri/set/experiments#>
PREFIX  oeev-sunagri: <http://www.opensilex.org/vocabulary/oeev-sunagri#>
PREFIX  skos: <http://www.w3.org/2004/02/skos/core#>
PREFIX  rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX  sunagri-prj: <http://www.opensilex.org/sunagri/set/projects#>
PREFIX  sunagri-infra: <http://www.opensilex.org/sunagri/set/infrastructures#>
PREFIX  sunagri-prf: <http://www.opensilex.org/sunagri/profiles#>
PREFIX  sunagri-grp: <http://www.opensilex.org/sunagri/groups#>
PREFIX  oa:   <http://www.w3.org/ns/oa#>
PREFIX  vocabulary: <http://www.opensilex.org/vocabulary/oeso#>
PREFIX  peco: <http://purl.obolibrary.org/obo/peco.owl#>
PREFIX  dcterms: <http://purl.org/dc/terms/#>
PREFIX  sunagri-doc: <http://www.opensilex.org/sunagri/set/documents#>
PREFIX  sunagri-factor: <http://www.opensilex.org/sunagri/set/factors#>
PREFIX  foaf: <http://xmlns.com/foaf/0.1/>
PREFIX  rdf4j: <http://rdf4j.org/schema/rdf4j#>
PREFIX  org:  <http://www.w3.org/ns/org#>
PREFIX  oeso-analysis: <https://www.opensilex.org/vocabulary/oeso/analysis#>
PREFIX  sunagri: <http://www.opensilex.org/sunagri/>
PREFIX  sunagri-ev: <http://www.opensilex.org/sunagri/events#>
PREFIX  sunagri-oowl-ext: <http://www.opensilex.org/sunagri/opensilex-owl-extension#>
PREFIX  vcard: <http://www.w3.org/2006/vcard/ns#>
PREFIX  sunagri-area: <http://www.opensilex.org/sunagri/set/area#>
PREFIX  oeev: <http://www.opensilex.org/vocabulary/oeev#>
PREFIX  sunagri-germplasm: <http://www.opensilex.org/sunagri/set/germplasms#>
PREFIX  sunagri-account: <http://www.opensilex.org/sunagri/set/user#>
PREFIX  rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX  sesame: <http://www.openrdf.org/schema/sesame#>
PREFIX  time: <http://www.w3.org/2006/time#>
PREFIX  os-sec: <http://www.opensilex.org/security#>
PREFIX  sunagri-so: <http://www.opensilex.org/sunagri/set/scientific-objects#>
PREFIX  agrovoc: <http://aims.fao.org/aos/agrovoc/factors#>
PREFIX  sunagri-usr: <http://www.opensilex.org/sunagri/users#>
PREFIX  dc:   <http://purl.org/dc/terms/>
PREFIX  sunagri-device: <http://www.opensilex.org/sunagri/set/devices#>

DELETE{ 
 ?s ?p sunagri:stemRank 
}
INSERT { 
  ?s ?p sunagri:rankInStem
}
WHERE { 
 ?s ?p sunagri:stemRank 
}
```