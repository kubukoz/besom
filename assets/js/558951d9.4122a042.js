"use strict";(self.webpackChunkbesom_website=self.webpackChunkbesom_website||[]).push([[432],{3905:(e,t,n)=>{n.d(t,{Zo:()=>u,kt:()=>d});var r=n(7294);function o(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function a(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,r)}return n}function i(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?a(Object(n),!0).forEach((function(t){o(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):a(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function p(e,t){if(null==e)return{};var n,r,o=function(e,t){if(null==e)return{};var n,r,o={},a=Object.keys(e);for(r=0;r<a.length;r++)n=a[r],t.indexOf(n)>=0||(o[n]=e[n]);return o}(e,t);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);for(r=0;r<a.length;r++)n=a[r],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(o[n]=e[n])}return o}var s=r.createContext({}),l=function(e){var t=r.useContext(s),n=t;return e&&(n="function"==typeof e?e(t):i(i({},t),e)),n},u=function(e){var t=l(e.components);return r.createElement(s.Provider,{value:t},e.children)},c="mdxType",m={inlineCode:"code",wrapper:function(e){var t=e.children;return r.createElement(r.Fragment,{},t)}},f=r.forwardRef((function(e,t){var n=e.components,o=e.mdxType,a=e.originalType,s=e.parentName,u=p(e,["components","mdxType","originalType","parentName"]),c=l(n),f=o,d=c["".concat(s,".").concat(f)]||c[f]||m[f]||a;return n?r.createElement(d,i(i({ref:t},u),{},{components:n})):r.createElement(d,i({ref:t},u))}));function d(e,t){var n=arguments,o=t&&t.mdxType;if("string"==typeof e||o){var a=n.length,i=new Array(a);i[0]=f;var p={};for(var s in t)hasOwnProperty.call(t,s)&&(p[s]=t[s]);p.originalType=e,p[c]="string"==typeof e?e:o,i[1]=p;for(var l=2;l<a;l++)i[l]=n[l];return r.createElement.apply(null,i)}return r.createElement.apply(null,n)}f.displayName="MDXCreateElement"},6109:(e,t,n)=>{n.r(t),n.d(t,{assets:()=>s,contentTitle:()=>i,default:()=>m,frontMatter:()=>a,metadata:()=>p,toc:()=>l});var r=n(7462),o=(n(7294),n(3905));const a={title:"String interpolation"},i=void 0,p={unversionedId:"interpolator",id:"interpolator",title:"String interpolation",description:"One of the very common use case in Pulumi programs is the need to interpolate a syntax. Given that the most interesting values arrive asynchronously as Outputs of resources that user creates this usually interpolation would require a map call or even a flatMap + map chain for more than one Output (or a for comprehension, alternatively). To make this common pattern easier Besom implements a type-safe interpolator that works with Outputs seamlessly:",source:"@site/docs/interpolator.md",sourceDirName:".",slug:"/interpolator",permalink:"/besom/docs/interpolator",draft:!1,tags:[],version:"current",frontMatter:{title:"String interpolation"},sidebar:"docsSidebar",previous:{title:"Lifting",permalink:"/besom/docs/lifting"},next:{title:"Components",permalink:"/besom/docs/components"}},s={},l=[],u={toc:l},c="wrapper";function m(e){let{components:t,...n}=e;return(0,o.kt)(c,(0,r.Z)({},u,n,{components:t,mdxType:"MDXLayout"}),(0,o.kt)("p",null,"One of the very common use case in Pulumi programs is the need to interpolate a syntax. Given that the most interesting values arrive asynchronously as Outputs of resources that user creates this usually interpolation would require a ",(0,o.kt)("inlineCode",{parentName:"p"},"map")," call or even a ",(0,o.kt)("inlineCode",{parentName:"p"},"flatMap")," + ",(0,o.kt)("inlineCode",{parentName:"p"},"map")," chain for more than one Output (or a for comprehension, alternatively). To make this common pattern easier Besom implements a type-safe interpolator that works with Outputs seamlessly:"),(0,o.kt)("pre",null,(0,o.kt)("code",{parentName:"pre",className:"language-scala"},'val o1: Output[Int] = pod.port\nval o2: Output[String] = node.hostname\nval version: String = "v1"\n\u200b\n// or just p"" for shorthand\nval http: Output[String]  = pulumi"http://$o2:$o1/api/0.1.0/" \nval https: Output[String] = p"https://$o2:$o1/api/$version/"\n')),(0,o.kt)("admonition",{type:"tip"},(0,o.kt)("p",{parentName:"admonition"},"To avoid using standard Scala string interpolators with Outputs by mistake, it is recommended to use the besom compiler plugin. It will make the compiler fail on any attempt to interpolate an ",(0,o.kt)("inlineCode",{parentName:"p"},"Output")," with a standard string interpolator."),(0,o.kt)("p",{parentName:"admonition"},"For more infornation see ",(0,o.kt)("a",{parentName:"p",href:"/besom/docs/compiler_plugin"},"Compiler plugin"),".")))}m.isMDXComponent=!0}}]);