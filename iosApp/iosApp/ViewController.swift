import UIKit
import app

class ViewController: UIViewController, DateProtocol {
    
    @IBOutlet weak var label: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let currentDateClass = CurrentDate()
        currentDateClass.setProtocol(protocol: self)
        label.text = currentDateClass.getCurrentDate()
    }
    
    func getIosDate() -> String{
        let formatted = DateFormatter()
        formatted.dateFormat = "dd/MM/YYYY"
        return formatted.string(from: Date())
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }    
}
