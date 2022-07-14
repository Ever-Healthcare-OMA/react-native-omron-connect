using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Omron.Connect.RNOmronConnect
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNOmronConnectModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNOmronConnectModule"/>.
        /// </summary>
        internal RNOmronConnectModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNOmronConnect";
            }
        }
    }
}
