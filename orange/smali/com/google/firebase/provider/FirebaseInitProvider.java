public class com.google.firebase.provider.FirebaseInitProvider extends android.content.ContentProvider {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.google.firebase.provider.FirebaseInitProvider ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( android.content.pm.ProviderInfo p0 ) {
		 /* .locals 1 */
		 final String v0 = "FirebaseInitProvider ProviderInfo cannot be null."; // const-string v0, "FirebaseInitProvider ProviderInfo cannot be null."
		 /* .line 1 */
		 e.f.a.b.c.m.h .a ( p0,v0 );
		 /* .line 2 */
		 p0 = this.authority;
		 final String v0 = "com.google.firebase.firebaseinitprovider"; // const-string v0, "com.google.firebase.firebaseinitprovider"
		 p0 = 		 (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez p0, :cond_0 */
		 return;
		 /* .line 3 */
	 } // :cond_0
	 /* new-instance p0, Ljava/lang/IllegalStateException; */
	 final String v0 = "Incorrect provider authority in manifest.Most likely due to a missing applicationId variable in application\'s build.gradle."; // const-string v0, "Incorrect provider authority in manifest.Most likely due to a missing applicationId variable in application\'s build.gradle."
	 /* invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
} // .end method
/* # virtual methods */
public void attachInfo ( android.content.Context p0, android.content.pm.ProviderInfo p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 com.google.firebase.provider.FirebaseInitProvider .a ( p2 );
	 /* .line 2 */
	 /* invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V */
	 return;
} // .end method
public Integer delete ( android.net.Uri p0, java.lang.String p1, java.lang.String[] p2 ) {
	 /* .locals 0 */
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String getType ( android.net.Uri p0 ) {
	 /* .locals 0 */
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.net.Uri insert ( android.net.Uri p0, android.content.ContentValues p1 ) {
	 /* .locals 0 */
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean onCreate ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 (( android.content.ContentProvider ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;
	 e.f.c.h .a ( v0 );
	 final String v1 = "FirebaseInitProvider"; // const-string v1, "FirebaseInitProvider"
	 /* if-nez v0, :cond_0 */
	 final String v0 = "FirebaseApp initialization unsuccessful"; // const-string v0, "FirebaseApp initialization unsuccessful"
	 /* .line 2 */
	 android.util.Log .i ( v1,v0 );
} // :cond_0
final String v0 = "FirebaseApp initialization successful"; // const-string v0, "FirebaseApp initialization successful"
/* .line 3 */
android.util.Log .i ( v1,v0 );
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.database.Cursor query ( android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer update ( android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
