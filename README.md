
# react-native-omron-connect

## Getting started

`$ npm install react-native-omron-connect --save`

### Mostly automatic installation

`$ react-native link react-native-omron-connect`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-omron-connect` and add `RNOmronConnect.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNOmronConnect.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNOmronConnectPackage;` to the imports at the top of the file
  - Add `new RNOmronConnectPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-omron-connect'
  	project(':react-native-omron-connect').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-omron-connect/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-omron-connect')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNOmronConnect.sln` in `node_modules/react-native-omron-connect/windows/RNOmronConnect.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Omron.Connect.RNOmronConnect;` to the usings at the top of the file
  - Add `new RNOmronConnectPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNOmronConnect from 'react-native-omron-connect';

// TODO: What to do with the module?
RNOmronConnect;
```
  