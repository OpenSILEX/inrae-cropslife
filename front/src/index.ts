 
import CropsLifeLoginComponent from "./components/layout/CropsLifeLoginComponent.vue";
import CropsLifeHeaderComponent from "./components/layout/CropsLifeHeaderComponent.vue";
import CropsLifeHomeComponent from "./components/layout/CropsLifeHomeComponent.vue";

export default {
    install(Vue, options) {
    },
    components: {
        "inrae-cropslife-CropsLifeHomeComponent": CropsLifeHomeComponent,
        "inrae-cropslife-CropsLifeLoginComponent": CropsLifeLoginComponent,
        "inrae-cropslife-CropsLifeHeaderComponent": CropsLifeHeaderComponent
    },
    lang: {
        "fr": require("./lang/cropslife-fr.json"),
        "en": require("./lang/cropslife-en.json"),
    }
};