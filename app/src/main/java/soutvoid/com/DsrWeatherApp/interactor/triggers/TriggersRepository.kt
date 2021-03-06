package soutvoid.com.DsrWeatherApp.interactor.triggers

import com.agna.ferro.mvp.component.scope.PerApplication
import com.birbit.android.jobqueue.JobManager
import rx.Observable
import soutvoid.com.DsrWeatherApp.interactor.triggers.data.NewTriggerRequest
import soutvoid.com.DsrWeatherApp.interactor.triggers.data.TriggerResponse
import soutvoid.com.DsrWeatherApp.interactor.triggers.network.TriggersApi
import javax.inject.Inject

@PerApplication
class TriggersRepository @Inject constructor(val api: TriggersApi) {

    fun newTrigger(newTriggerRequest: NewTriggerRequest): Observable<TriggerResponse> {
        return api.newTrigger(newTriggerRequest)
    }

    fun getTrigger(id: String): Observable<TriggerResponse> {
        return api.getTrigger(id)
    }

    fun deleteTrigger(id: String): Observable<Void> {
        return api.deleteTrigger(id)
    }

}