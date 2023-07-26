public class e.f.c.q.r {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public java.lang.String b;
	 public java.lang.String c;
	 public Integer d;
	 public Integer e;
	 /* # direct methods */
	 public e.f.c.q.r ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Le/f/c/q/r;->e:I */
		 /* .line 3 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static java.lang.String a ( Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
		 (( e.f.c.i ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/i;->c()Ljava/lang/String;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 (( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
		 (( e.f.c.i ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/i;->b()Ljava/lang/String;
		 final String v0 = "1:"; // const-string v0, "1:"
		 /* .line 3 */
		 v0 = 		 (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 /* if-nez v0, :cond_1 */
	 } // :cond_1
	 final String v0 = ":"; // const-string v0, ":"
	 /* .line 4 */
	 (( java.lang.String ) p0 ).split ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
	 /* .line 5 */
	 /* array-length v0, p0 */
	 int v1 = 2; // const/4 v1, 0x2
	 int v2 = 0; // const/4 v2, 0x0
	 /* if-ge v0, v1, :cond_2 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
/* aget-object p0, p0, v0 */
/* .line 7 */
v0 = (( java.lang.String ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_3
} // .end method
/* # virtual methods */
public final android.content.pm.PackageInfo a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 11 */
try { // :try_start_0
	 v0 = this.a;
	 (( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 int v1 = 0; // const/4 v1, 0x0
	 (( android.content.pm.PackageManager ) v0 ).getPackageInfo ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
	 /* :try_end_0 */
	 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 12 */
	 java.lang.String .valueOf ( p1 );
	 java.lang.String .valueOf ( p1 );
	 v0 = 	 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
	 /* add-int/lit8 v0, v0, 0x17 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
	 final String v0 = "Failed to find package "; // const-string v0, "Failed to find package "
	 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
	 android.util.Log .w ( v0,p1 );
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public synchronized java.lang.String a ( ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 /* .line 8 */
	 try { // :try_start_0
		 v0 = this.b;
		 /* if-nez v0, :cond_0 */
		 /* .line 9 */
		 (( e.f.c.q.r ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/c/q/r;->f()V
		 /* .line 10 */
	 } // :cond_0
	 v0 = this.b;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized java.lang.String b ( ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.c;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 (( e.f.c.q.r ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/c/q/r;->f()V
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.c;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized Integer c ( ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 /* iget v0, p0, Le/f/c/q/r;->d:I */
		 /* if-nez v0, :cond_0 */
		 final String v0 = "com.google.android.gms"; // const-string v0, "com.google.android.gms"
		 /* .line 2 */
		 (( e.f.c.q.r ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/q/r;->a(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 /* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
			 /* iput v0, p0, Le/f/c/q/r;->d:I */
			 /* .line 4 */
		 } // :cond_0
		 /* iget v0, p0, Le/f/c/q/r;->d:I */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
	 public synchronized Integer d ( ) {
		 /* .locals 5 */
		 /* monitor-enter p0 */
		 /* .line 1 */
		 try { // :try_start_0
			 /* iget v0, p0, Le/f/c/q/r;->e:I */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 /* iget v0, p0, Le/f/c/q/r;->e:I */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit p0 */
				 /* .line 3 */
			 } // :cond_0
			 try { // :try_start_1
				 v0 = this.a;
				 (( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
				 final String v1 = "com.google.android.c2dm.permission.SEND"; // const-string v1, "com.google.android.c2dm.permission.SEND"
				 final String v2 = "com.google.android.gms"; // const-string v2, "com.google.android.gms"
				 /* .line 4 */
				 v1 = 				 (( android.content.pm.PackageManager ) v0 ).checkPermission ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
				 int v2 = -1; // const/4 v2, -0x1
				 int v3 = 0; // const/4 v3, 0x0
				 /* if-ne v1, v2, :cond_1 */
				 final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
				 final String v1 = "Google Play services missing or without correct permission."; // const-string v1, "Google Play services missing or without correct permission."
				 /* .line 5 */
				 android.util.Log .e ( v0,v1 );
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* .line 6 */
				 /* monitor-exit p0 */
				 /* .line 7 */
			 } // :cond_1
			 try { // :try_start_2
				 v1 = 				 e.f.a.b.c.p.h .h ( );
				 int v2 = 1; // const/4 v2, 0x1
				 /* if-nez v1, :cond_2 */
				 /* .line 8 */
				 /* new-instance v1, Landroid/content/Intent; */
				 final String v4 = "com.google.android.c2dm.intent.REGISTER"; // const-string v4, "com.google.android.c2dm.intent.REGISTER"
				 /* invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
				 final String v4 = "com.google.android.gms"; // const-string v4, "com.google.android.gms"
				 /* .line 9 */
				 (( android.content.Intent ) v1 ).setPackage ( v4 ); // invoke-virtual {v1, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
				 /* .line 10 */
				 (( android.content.pm.PackageManager ) v0 ).queryIntentServices ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
				 if ( v1 != null) { // if-eqz v1, :cond_2
					 v1 = 					 /* .line 11 */
					 /* if-lez v1, :cond_2 */
					 /* .line 12 */
					 /* iput v2, p0, Le/f/c/q/r;->e:I */
					 /* :try_end_2 */
					 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
					 /* .line 13 */
					 /* monitor-exit p0 */
					 /* .line 14 */
				 } // :cond_2
				 try { // :try_start_3
					 /* new-instance v1, Landroid/content/Intent; */
					 final String v4 = "com.google.iid.TOKEN_REQUEST"; // const-string v4, "com.google.iid.TOKEN_REQUEST"
					 /* invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
					 final String v4 = "com.google.android.gms"; // const-string v4, "com.google.android.gms"
					 /* .line 15 */
					 (( android.content.Intent ) v1 ).setPackage ( v4 ); // invoke-virtual {v1, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
					 /* .line 16 */
					 (( android.content.pm.PackageManager ) v0 ).queryBroadcastReceivers ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;
					 int v1 = 2; // const/4 v1, 0x2
					 if ( v0 != null) { // if-eqz v0, :cond_3
						 v0 = 						 /* .line 17 */
						 /* if-lez v0, :cond_3 */
						 /* .line 18 */
						 /* iput v1, p0, Le/f/c/q/r;->e:I */
						 /* :try_end_3 */
						 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
						 /* .line 19 */
						 /* monitor-exit p0 */
					 } // :cond_3
					 try { // :try_start_4
						 final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
						 final String v3 = "Failed to resolve IID implementation package, falling back"; // const-string v3, "Failed to resolve IID implementation package, falling back"
						 /* .line 20 */
						 android.util.Log .w ( v0,v3 );
						 /* .line 21 */
						 v0 = 						 e.f.a.b.c.p.h .h ( );
						 if ( v0 != null) { // if-eqz v0, :cond_4
							 /* .line 22 */
							 /* iput v1, p0, Le/f/c/q/r;->e:I */
							 /* .line 23 */
						 } // :cond_4
						 /* iput v2, p0, Le/f/c/q/r;->e:I */
						 /* .line 24 */
					 } // :goto_0
					 /* iget v0, p0, Le/f/c/q/r;->e:I */
					 /* :try_end_4 */
					 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
					 /* monitor-exit p0 */
					 /* :catchall_0 */
					 /* move-exception v0 */
					 /* monitor-exit p0 */
					 /* throw v0 */
				 } // .end method
				 public Boolean e ( ) {
					 /* .locals 1 */
					 /* .line 1 */
					 v0 = 					 (( e.f.c.q.r ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/q/r;->d()I
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 int v0 = 1; // const/4 v0, 0x1
					 } // :cond_0
					 int v0 = 0; // const/4 v0, 0x0
				 } // .end method
				 public synchronized final void f ( ) {
					 /* .locals 2 */
					 /* monitor-enter p0 */
					 /* .line 1 */
					 try { // :try_start_0
						 v0 = this.a;
						 (( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
						 (( e.f.c.q.r ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/q/r;->a(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
						 if ( v0 != null) { // if-eqz v0, :cond_0
							 /* .line 2 */
							 /* iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
							 java.lang.Integer .toString ( v1 );
							 this.b = v1;
							 /* .line 3 */
							 v0 = this.versionName;
							 this.c = v0;
							 /* :try_end_0 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 /* .line 4 */
						 } // :cond_0
						 /* monitor-exit p0 */
						 return;
						 /* :catchall_0 */
						 /* move-exception v0 */
						 /* monitor-exit p0 */
						 /* throw v0 */
					 } // .end method
