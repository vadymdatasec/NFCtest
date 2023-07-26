public class e.f.c.t.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final android.content.SharedPreferences b;
	 public Boolean c;
	 /* # direct methods */
	 public e.f.c.t.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 e.f.c.t.a .a ( p1 );
		 this.a = p1;
		 /* .line 3 */
		 /* new-instance p3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v0 = "com.google.firebase.common.prefs:"; // const-string v0, "com.google.firebase.common.prefs:"
		 (( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 int p3 = 0; // const/4 p3, 0x0
		 /* .line 4 */
		 (( android.content.Context ) p1 ).getSharedPreferences ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 this.b = p1;
		 /* .line 5 */
		 p1 = 		 (( e.f.c.t.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/t/a;->b()Z
		 /* iput-boolean p1, p0, Le/f/c/t/a;->c:Z */
		 return;
	 } // .end method
	 public static android.content.Context a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* const/16 v1, 0x18 */
		 /* if-ge v0, v1, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 c.h.f.f .a ( p0 );
} // .end method
/* # virtual methods */
public synchronized Boolean a ( ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 /* .line 3 */
	 try { // :try_start_0
		 /* iget-boolean v0, p0, Le/f/c/t/a;->c:Z */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
	 public final Boolean b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 final String v1 = "firebase_data_collection_default_enabled"; // const-string v1, "firebase_data_collection_default_enabled"
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.b;
			 v0 = 			 int v2 = 1; // const/4 v2, 0x1
			 /* .line 3 */
		 } // :cond_0
		 v0 = 		 (( e.f.c.t.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/t/a;->c()Z
	 } // .end method
	 public final Boolean c ( ) {
		 /* .locals 4 */
		 final String v0 = "firebase_data_collection_default_enabled"; // const-string v0, "firebase_data_collection_default_enabled"
		 /* .line 1 */
		 try { // :try_start_0
			 v1 = this.a;
			 (( android.content.Context ) v1 ).getPackageManager ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 2 */
				 v2 = this.a;
				 /* .line 3 */
				 (( android.content.Context ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
				 /* const/16 v3, 0x80 */
				 /* .line 4 */
				 (( android.content.pm.PackageManager ) v1 ).getApplicationInfo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* .line 5 */
					 v2 = this.metaData;
					 if ( v2 != null) { // if-eqz v2, :cond_0
						 v2 = this.metaData;
						 /* .line 6 */
						 v2 = 						 (( android.os.Bundle ) v2 ).containsKey ( v0 ); // invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
						 if ( v2 != null) { // if-eqz v2, :cond_0
							 /* .line 7 */
							 v1 = this.metaData;
							 v0 = 							 (( android.os.Bundle ) v1 ).getBoolean ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
							 /* :try_end_0 */
							 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
							 /* :catch_0 */
						 } // :cond_0
						 int v0 = 1; // const/4 v0, 0x1
					 } // .end method
