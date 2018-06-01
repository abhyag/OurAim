package com.example.abhijit.myapplicationtest

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import org.hamcrest.Matchers.allOf
import android.support.test.rule.ActivityTestRule




/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest  {

    @get:Rule
    var mLoginActivityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.abhijit.myapplicationtes", appContext.packageName)
    }


    @Test
    fun clickSignUpButtonAfterFillingForm_showProgressAndSuccessScreen() {
        val first_name = "Firstname"
        val last_name = "lastname"
        val emailAddress = "firstname.lastname@g.com"
        val password = "password"

        //find the firstname edit text and type in the first name
        onView(withId(R.id.edit_text_first_name)).  .perform(typeText(first_name), closeSoftKeyboard())

        //find the lastname edit text and type in the last name
        onView(withId(R.id.edit_text_last_name)).perform(typeText(last_name), closeSoftKeyboard())

        //find the email address edit text and type in the email address
        onView(withId(R.id.edit_text_email)).perform(typeText(emailAddress), closeSoftKeyboard())

        //find the password edit text and type in the password
        onView(withId(R.id.edit_text_password)).perform(typeText(password), closeSoftKeyboard())

        //click the signup button
        onView(withId(R.id.button_sign_up)).perform(click())

        //check that we can see the success screen with success message
        val successString ="success"// InstrumentationRegistry.getTargetContext().getString(R.string.text_sign_up_successful)
        onView(withId(R.id.text_view_status_message)).check(matches(allOf(withText(successString), isDisplayed())))

    }

}

