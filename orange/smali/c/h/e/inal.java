public class inal implements androidx.core.app.JobIntentService$e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.app.job.JobWorkItem a;
	 public final androidx.core.app.JobIntentService$f b; //synthetic
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = this.b;
		 /* monitor-enter v0 */
		 /* .line 2 */
		 try { // :try_start_0
			 v1 = this.b;
			 v1 = this.c;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 3 */
				 v1 = this.b;
				 v1 = this.c;
				 v2 = this.a;
				 (( android.app.job.JobParameters ) v1 ).completeWork ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/job/JobParameters;->completeWork(Landroid/app/job/JobWorkItem;)V
				 /* .line 4 */
			 } // :cond_0
			 /* monitor-exit v0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception v1 */
			 /* monitor-exit v0 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* throw v1 */
		 } // .end method
		 public android.content.Intent getIntent ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.a;
			 (( android.app.job.JobWorkItem ) v0 ).getIntent ( ); // invoke-virtual {v0}, Landroid/app/job/JobWorkItem;->getIntent()Landroid/content/Intent;
		 } // .end method
