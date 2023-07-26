public class e.f.a.a.j.j0.j.g implements e.f.a.a.j.j0.j.y {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final e.f.a.a.j.j0.k.e b;
	 public final e.f.a.a.j.j0.j.m c;
	 /* # direct methods */
	 public e.f.a.a.j.j0.j.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( Object p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/zip/Adler32; */
		 /* invoke-direct {v0}, Ljava/util/zip/Adler32;-><init>()V */
		 /* .line 2 */
		 v1 = this.a;
		 (( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 final String v2 = "UTF-8"; // const-string v2, "UTF-8"
		 java.nio.charset.Charset .forName ( v2 );
		 (( java.lang.String ) v1 ).getBytes ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
		 (( java.util.zip.Adler32 ) v0 ).update ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/zip/Adler32;->update([B)V
		 /* .line 3 */
		 (( e.f.a.a.j.x ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;
		 java.nio.charset.Charset .forName ( v2 );
		 (( java.lang.String ) v1 ).getBytes ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
		 (( java.util.zip.Adler32 ) v0 ).update ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/zip/Adler32;->update([B)V
		 int v1 = 4; // const/4 v1, 0x4
		 /* .line 4 */
		 java.nio.ByteBuffer .allocate ( v1 );
		 /* .line 5 */
		 (( e.f.a.a.j.x ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
		 v2 = 		 e.f.a.a.j.m0.a .a ( v2 );
		 (( java.nio.ByteBuffer ) v1 ).putInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
		 /* .line 6 */
		 (( java.nio.ByteBuffer ) v1 ).array ( ); // invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B
		 /* .line 7 */
		 (( java.util.zip.Adler32 ) v0 ).update ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/zip/Adler32;->update([B)V
		 /* .line 8 */
		 (( e.f.a.a.j.x ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->b()[B
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 9 */
			 (( e.f.a.a.j.x ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->b()[B
			 (( java.util.zip.Adler32 ) v0 ).update ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/zip/Adler32;->update([B)V
			 /* .line 10 */
		 } // :cond_0
		 (( java.util.zip.Adler32 ) v0 ).getValue ( ); // invoke-virtual {v0}, Ljava/util/zip/Adler32;->getValue()J
		 /* move-result-wide v0 */
		 /* long-to-int p1, v0 */
	 } // .end method
	 public void a ( Object p0, Integer p1 ) {
		 /* .locals 13 */
		 /* .line 14 */
		 /* new-instance v0, Landroid/content/ComponentName; */
		 v1 = this.a;
		 /* const-class v2, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService; */
		 /* invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 /* .line 15 */
		 v1 = this.a;
		 final String v2 = "jobscheduler"; // const-string v2, "jobscheduler"
		 /* .line 16 */
		 (( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v1, Landroid/app/job/JobScheduler; */
		 /* .line 17 */
		 v2 = 		 (( e.f.a.a.j.j0.j.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/a/j/j0/j/g;->a(Le/f/a/a/j/x;)I
		 /* .line 18 */
		 v3 = 		 (( e.f.a.a.j.j0.j.g ) p0 ).a ( v1, v2, p2 ); // invoke-virtual {p0, v1, v2, p2}, Le/f/a/a/j/j0/j/g;->a(Landroid/app/job/JobScheduler;II)Z
		 final String v4 = "JobInfoScheduler"; // const-string v4, "JobInfoScheduler"
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 final String p2 = "Upload for context %s is already scheduled.Returning..."; // const-string p2, "Upload for context %s is already scheduled.Returning..."
			 /* .line 19 */
			 e.f.a.a.j.h0.a .a ( v4,p2,p1 );
			 return;
			 /* .line 20 */
		 } // :cond_0
		 v3 = this.b;
		 /* move-result-wide v11 */
		 /* .line 21 */
		 v5 = this.c;
		 /* new-instance v3, Landroid/app/job/JobInfo$Builder; */
		 /* invoke-direct {v3, v2, v0}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V */
		 /* .line 22 */
		 (( e.f.a.a.j.x ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
		 /* move-object v6, v3 */
		 /* move-wide v8, v11 */
		 /* move v10, p2 */
		 /* .line 23 */
		 /* invoke-virtual/range {v5 ..v10}, Le/f/a/a/j/j0/j/m;->a(Landroid/app/job/JobInfo$Builder;Le/f/a/a/d;JI)Landroid/app/job/JobInfo$Builder; */
		 /* .line 24 */
		 /* new-instance v0, Landroid/os/PersistableBundle; */
		 /* invoke-direct {v0}, Landroid/os/PersistableBundle;-><init>()V */
		 final String v5 = "attemptNumber"; // const-string v5, "attemptNumber"
		 /* .line 25 */
		 (( android.os.PersistableBundle ) v0 ).putInt ( v5, p2 ); // invoke-virtual {v0, v5, p2}, Landroid/os/PersistableBundle;->putInt(Ljava/lang/String;I)V
		 /* .line 26 */
		 (( e.f.a.a.j.x ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;
		 final String v6 = "backendName"; // const-string v6, "backendName"
		 (( android.os.PersistableBundle ) v0 ).putString ( v6, v5 ); // invoke-virtual {v0, v6, v5}, Landroid/os/PersistableBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 27 */
		 (( e.f.a.a.j.x ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
		 v5 = 		 e.f.a.a.j.m0.a .a ( v5 );
		 final String v6 = "priority"; // const-string v6, "priority"
		 (( android.os.PersistableBundle ) v0 ).putInt ( v6, v5 ); // invoke-virtual {v0, v6, v5}, Landroid/os/PersistableBundle;->putInt(Ljava/lang/String;I)V
		 /* .line 28 */
		 (( e.f.a.a.j.x ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->b()[B
		 int v6 = 0; // const/4 v6, 0x0
		 if ( v5 != null) { // if-eqz v5, :cond_1
			 /* .line 29 */
			 (( e.f.a.a.j.x ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->b()[B
			 android.util.Base64 .encodeToString ( v5,v6 );
			 final String v7 = "extras"; // const-string v7, "extras"
			 (( android.os.PersistableBundle ) v0 ).putString ( v7, v5 ); // invoke-virtual {v0, v7, v5}, Landroid/os/PersistableBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 30 */
		 } // :cond_1
		 (( android.app.job.JobInfo$Builder ) v3 ).setExtras ( v0 ); // invoke-virtual {v3, v0}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;
		 int v0 = 5; // const/4 v0, 0x5
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* aput-object p1, v0, v6 */
		 int v5 = 1; // const/4 v5, 0x1
		 /* .line 31 */
		 java.lang.Integer .valueOf ( v2 );
		 /* aput-object v2, v0, v5 */
		 int v2 = 2; // const/4 v2, 0x2
		 v5 = this.c;
		 /* .line 32 */
		 (( e.f.a.a.j.x ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
		 (( e.f.a.a.j.j0.j.m ) v5 ).a ( p1, v11, v12, p2 ); // invoke-virtual {v5, p1, v11, v12, p2}, Le/f/a/a/j/j0/j/m;->a(Le/f/a/a/d;JI)J
		 /* move-result-wide v5 */
		 java.lang.Long .valueOf ( v5,v6 );
		 /* aput-object p1, v0, v2 */
		 int p1 = 3; // const/4 p1, 0x3
		 /* .line 33 */
		 java.lang.Long .valueOf ( v11,v12 );
		 /* aput-object v2, v0, p1 */
		 int p1 = 4; // const/4 p1, 0x4
		 /* .line 34 */
		 java.lang.Integer .valueOf ( p2 );
		 /* aput-object p2, v0, p1 */
		 final String p1 = "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d).Attempt %d"; // const-string p1, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d).Attempt %d"
		 /* .line 35 */
		 e.f.a.a.j.h0.a .a ( v4,p1,v0 );
		 /* .line 36 */
		 (( android.app.job.JobInfo$Builder ) v3 ).build ( ); // invoke-virtual {v3}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;
		 (( android.app.job.JobScheduler ) v1 ).schedule ( p1 ); // invoke-virtual {v1, p1}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I
		 return;
	 } // .end method
	 public final Boolean a ( android.app.job.JobScheduler p0, Integer p1, Integer p2 ) {
		 /* .locals 4 */
		 /* .line 11 */
		 (( android.app.job.JobScheduler ) p1 ).getAllPendingJobs ( ); // invoke-virtual {p1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;
	 v0 = 	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* check-cast v0, Landroid/app/job/JobInfo; */
		 /* .line 12 */
		 (( android.app.job.JobInfo ) v0 ).getExtras ( ); // invoke-virtual {v0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;
		 final String v3 = "attemptNumber"; // const-string v3, "attemptNumber"
		 v2 = 		 (( android.os.PersistableBundle ) v2 ).getInt ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/PersistableBundle;->getInt(Ljava/lang/String;)I
		 /* .line 13 */
		 v0 = 		 (( android.app.job.JobInfo ) v0 ).getId ( ); // invoke-virtual {v0}, Landroid/app/job/JobInfo;->getId()I
		 /* if-ne v0, p2, :cond_0 */
		 /* if-lt v2, p3, :cond_1 */
		 int v1 = 1; // const/4 v1, 0x1
	 } // :cond_1
} // .end method
