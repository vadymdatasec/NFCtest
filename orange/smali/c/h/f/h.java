public abstract class c.h.f.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .line 11 */
		 v0 = 		 android.os.Process .myPid ( );
		 /* .line 12 */
		 v1 = 		 android.os.Process .myUid ( );
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 /* .line 13 */
		 p0 = 		 c.h.f.h .a ( p0,p1,v0,v1,v2 );
	 } // .end method
	 public static Integer a ( android.content.Context p0, java.lang.String p1, Integer p2, Integer p3, java.lang.String p4 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p2 = 		 (( android.content.Context ) p0 ).checkPermission ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I
		 int v0 = -1; // const/4 v0, -0x1
		 /* if-ne p2, v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 c.h.e.m .a ( p1 );
	 int p2 = 0; // const/4 p2, 0x0
	 /* if-nez p1, :cond_1 */
} // :cond_1
/* if-nez p4, :cond_4 */
/* .line 3 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.pm.PackageManager ) p4 ).getPackagesForUid ( p3 ); // invoke-virtual {p4, p3}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;
if ( p4 != null) { // if-eqz p4, :cond_3
	 /* .line 4 */
	 /* array-length v1, p4 */
	 /* if-gtz v1, :cond_2 */
	 /* .line 5 */
} // :cond_2
/* aget-object p4, p4, p2 */
} // :cond_3
} // :goto_0
/* .line 6 */
} // :cond_4
} // :goto_1
v0 = android.os.Process .myUid ( );
/* .line 7 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* if-ne v0, p3, :cond_5 */
/* .line 8 */
v0 = c.h.m.c .a ( v1,p4 );
if ( v0 != null) { // if-eqz v0, :cond_5
int v0 = 1; // const/4 v0, 0x1
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 9 */
p0 = c.h.e.m .a ( p0,p3,p1,p4 );
/* .line 10 */
} // :cond_6
p0 = c.h.e.m .a ( p0,p1,p4 );
} // :goto_3
/* if-nez p0, :cond_7 */
} // :cond_7
int p2 = -2; // const/4 p2, -0x2
} // :goto_4
} // .end method
