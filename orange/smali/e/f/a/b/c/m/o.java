public abstract class e.f.a.b.c.m.o {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.Object a;
	 public static Boolean b;
	 public static Integer c;
	 /* # direct methods */
	 public static e.f.a.b.c.m.o ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer a ( android.content.Context p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 e.f.a.b.c.m.o .b ( p0 );
		 /* .line 2 */
	 } // .end method
	 public static void b ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = e.f.a.b.c.m.o.a;
		 /* monitor-enter v0 */
		 /* .line 2 */
		 try { // :try_start_0
			 /* sget-boolean v1, Le/f/a/b/c/m/o;->b:Z */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 3 */
				 /* monitor-exit v0 */
				 return;
			 } // :cond_0
			 int v1 = 1; // const/4 v1, 0x1
			 /* .line 4 */
			 e.f.a.b.c.m.o.b = (v1!= 0);
			 /* .line 5 */
			 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 /* .line 6 */
			 e.f.a.b.c.q.b .b ( p0 );
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* const/16 v2, 0x80 */
			 /* .line 7 */
			 try { // :try_start_1
				 (( e.f.a.b.c.q.a ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/a/b/c/q/a;->a(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
				 /* .line 8 */
				 p0 = this.metaData;
				 /* :try_end_1 */
				 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* if-nez p0, :cond_1 */
				 /* .line 9 */
				 try { // :try_start_2
					 /* monitor-exit v0 */
					 /* :try_end_2 */
					 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
					 return;
				 } // :cond_1
				 try { // :try_start_3
					 final String v1 = "com.google.app.id"; // const-string v1, "com.google.app.id"
					 /* .line 10 */
					 (( android.os.Bundle ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
					 final String v1 = "com.google.android.gms.version"; // const-string v1, "com.google.android.gms.version"
					 /* .line 11 */
					 p0 = 					 (( android.os.Bundle ) p0 ).getInt ( v1 ); // invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
					 /* :try_end_3 */
					 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 ..:try_end_3} :catch_0 */
					 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
					 /* :catch_0 */
					 /* move-exception p0 */
					 try { // :try_start_4
						 final String v1 = "MetadataValueReader"; // const-string v1, "MetadataValueReader"
						 final String v2 = "This should never happen."; // const-string v2, "This should never happen."
						 /* .line 12 */
						 android.util.Log .wtf ( v1,v2,p0 );
						 /* .line 13 */
					 } // :goto_0
					 /* monitor-exit v0 */
					 return;
					 /* :catchall_0 */
					 /* move-exception p0 */
					 /* monitor-exit v0 */
					 /* :try_end_4 */
					 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
					 /* throw p0 */
				 } // .end method
