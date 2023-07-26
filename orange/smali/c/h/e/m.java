public abstract class c.h.e.m {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.content.Context p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
		 /* .locals 2 */
		 /* .line 6 */
		 /* const/16 v1, 0x1d */
		 /* if-lt v0, v1, :cond_1 */
		 /* .line 7 */
		 c.h.e.l .b ( p0 );
		 /* .line 8 */
		 v1 = 		 android.os.Binder .getCallingUid ( );
		 /* .line 9 */
		 p3 = 		 c.h.e.l .a ( v0,p2,v1,p3 );
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* .line 10 */
		 } // :cond_0
		 c.h.e.l .a ( p0 );
		 /* .line 11 */
		 p0 = 		 c.h.e.l .a ( v0,p2,p1,p0 );
		 /* .line 12 */
	 } // :cond_1
	 p0 = 	 c.h.e.m .a ( p0,p2,p3 );
} // .end method
public static Integer a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
	 /* .locals 2 */
	 /* .line 3 */
	 /* const/16 v1, 0x17 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 4 */
	 /* const-class v0, Landroid/app/AppOpsManager; */
	 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;
	 /* check-cast p0, Landroid/app/AppOpsManager; */
	 /* .line 5 */
	 p0 = 	 (( android.app.AppOpsManager ) p0 ).noteProxyOpNoThrow ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/app/AppOpsManager;->noteProxyOpNoThrow(Ljava/lang/String;Ljava/lang/String;)I
} // :cond_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static java.lang.String a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
android.app.AppOpsManager .permissionToOp ( p0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
