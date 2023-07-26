public class com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService extends android.app.job.JobService {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService p0, android.app.job.JobParameters p1 ) { //synthethic
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 (( android.app.job.JobService ) p0 ).jobFinished ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean onStartJob ( android.app.job.JobParameters p0 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 (( android.app.job.JobParameters ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;
		 final String v1 = "backendName"; // const-string v1, "backendName"
		 (( android.os.PersistableBundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/PersistableBundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 /* .line 2 */
		 (( android.app.job.JobParameters ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;
		 final String v2 = "extras"; // const-string v2, "extras"
		 (( android.os.PersistableBundle ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/PersistableBundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 /* .line 3 */
		 (( android.app.job.JobParameters ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;
		 final String v3 = "priority"; // const-string v3, "priority"
		 v2 = 		 (( android.os.PersistableBundle ) v2 ).getInt ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/PersistableBundle;->getInt(Ljava/lang/String;)I
		 /* .line 4 */
		 (( android.app.job.JobParameters ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;
		 final String v4 = "attemptNumber"; // const-string v4, "attemptNumber"
		 v3 = 		 (( android.os.PersistableBundle ) v3 ).getInt ( v4 ); // invoke-virtual {v3, v4}, Landroid/os/PersistableBundle;->getInt(Ljava/lang/String;)I
		 /* .line 5 */
		 (( android.app.job.JobService ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/job/JobService;->getApplicationContext()Landroid/content/Context;
		 e.f.a.a.j.c0 .a ( v4 );
		 /* .line 6 */
		 e.f.a.a.j.x .d ( );
		 /* .line 7 */
		 (( e.f.a.a.j.x$a ) v4 ).a ( v0 ); // invoke-virtual {v4, v0}, Le/f/a/a/j/x$a;->a(Ljava/lang/String;)Le/f/a/a/j/x$a;
		 /* .line 8 */
		 e.f.a.a.j.m0.a .a ( v2 );
		 (( e.f.a.a.j.x$a ) v4 ).a ( v0 ); // invoke-virtual {v4, v0}, Le/f/a/a/j/x$a;->a(Le/f/a/a/d;)Le/f/a/a/j/x$a;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 9 */
			 android.util.Base64 .decode ( v1,v0 );
			 (( e.f.a.a.j.x$a ) v4 ).a ( v0 ); // invoke-virtual {v4, v0}, Le/f/a/a/j/x$a;->a([B)Le/f/a/a/j/x$a;
			 /* .line 10 */
		 } // :cond_0
		 e.f.a.a.j.c0 .b ( );
		 /* .line 11 */
		 (( e.f.a.a.j.c0 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/a/j/c0;->a()Le/f/a/a/j/j0/j/s;
		 /* .line 12 */
		 (( e.f.a.a.j.x$a ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/a/a/j/x$a;->a()Le/f/a/a/j/x;
		 e.f.a.a.j.j0.j.h .a ( p0,p1 );
		 (( e.f.a.a.j.j0.j.s ) v0 ).a ( v1, v3, p1 ); // invoke-virtual {v0, v1, v3, p1}, Le/f/a/a/j/j0/j/s;->a(Le/f/a/a/j/x;ILjava/lang/Runnable;)V
		 int p1 = 1; // const/4 p1, 0x1
	 } // .end method
	 public Boolean onStopJob ( android.app.job.JobParameters p0 ) {
		 /* .locals 0 */
		 int p1 = 1; // const/4 p1, 0x1
	 } // .end method
