import UIKit
import app

class ViewController: UIViewController, DateView {
    
    @IBOutlet weak var label: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let iosDateUtilities = IosDateUtilities()
        iosDateUtilities.initPlatformActual()
        let presenter = Presenter(view: self)
        presenter.start()
        
    }

    func showState(state: DateState) {
        label.text = state.text
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
}
