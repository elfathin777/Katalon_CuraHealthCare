import appointment.AppointmentAssertionKeywords as Assertion
import appointment.AppointmentFormKeywords as Form
import appointment.AppointmentSubmitKeywords as Submit

Form.appointmentForm(
    facility,
    readmission,
    healthcareProgram,
    visitDateType,
    comment
)

Submit.appointmentSubmit()

Assertion.appointmentAssertion(visitDateType)
