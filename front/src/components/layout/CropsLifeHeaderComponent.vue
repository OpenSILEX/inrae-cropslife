

<template>
  <opensilex-DefaultHeaderComponent> 
      <template v-slot:headerLogo> 
        <img
          v-bind:src="       $opensilex.getResourceURI( 
            'images/logo-short-cropslife.png'
          )"
          class="header-brand-img"
          alt="lavalite"
        />
        </template>
  </opensilex-DefaultHeaderComponent>
</template>

<script lang="ts">
import { Component, Prop } from "vue-property-decorator";
import Vue from "vue";
import OpenSilexVuePlugin from "../../../../../opensilex-front/front/src/models/OpenSilexVuePlugin";

@Component
export default class CropsLifeHeaderComponent extends Vue {
  $opensilex: OpenSilexVuePlugin;
}
</script>

<style scoped lang="scss">

.wrapper .header-brand .logo-img{
 width: 150px !important;
}
</style>

<i18n>    
</i18n>
