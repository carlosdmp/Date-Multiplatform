
import Foundation
import app

class IosDateUtilities{
    
    func initPlatformActual() {
        let currentDateClass = DateIos()
        PlatformDate().setImplementation(protocol: currentDateClass)
    }
    
    class DateIos: DateProtocol {
        func getIosDate() -> String{
            let formatted = DateFormatter()
            formatted.dateFormat = DateUtilities().dateFormat
            return formatted.string(from: Date())
        }
        
    }

}






