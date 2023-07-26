public abstract class c.h.n.y0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( android.view.ViewParent p0, android.view.View p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .line 8 */
		 /* instance-of v0, p0, Lc/h/n/t; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 9 */
			 /* check-cast p0, Lc/h/n/t; */
		 } // :cond_0
		 /* if-nez p2, :cond_2 */
		 /* .line 10 */
		 /* const/16 v0, 0x15 */
		 /* if-lt p2, v0, :cond_1 */
		 /* .line 11 */
		 try { // :try_start_0
			 /* :try_end_0 */
			 /* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 /* .line 12 */
			 /* new-instance p2, Ljava/lang/StringBuilder; */
			 /* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v0 = "ViewParent "; // const-string v0, "ViewParent "
			 (( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 final String p0 = " does not implement interface method onStopNestedScroll"; // const-string p0, " does not implement interface method onStopNestedScroll"
			 (( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 final String p2 = "ViewParentCompat"; // const-string p2, "ViewParentCompat"
			 android.util.Log .e ( p2,p0,p1 );
			 /* .line 13 */
		 } // :cond_1
		 /* instance-of p2, p0, Lc/h/n/v; */
		 if ( p2 != null) { // if-eqz p2, :cond_2
			 /* .line 14 */
			 /* check-cast p0, Lc/h/n/v; */
		 } // :cond_2
	 } // :goto_0
	 return;
} // .end method
public static void a ( android.view.ViewParent p0, android.view.View p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer[] p7 ) {
	 /* .locals 10 */
	 /* move-object v1, p0 */
	 /* .line 15 */
	 /* instance-of v0, v1, Lc/h/n/u; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 16 */
		 /* check-cast v1, Lc/h/n/u; */
		 /* move-object v2, p1 */
		 /* move v3, p2 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move v6, p5 */
		 /* move/from16 v7, p6 */
		 /* move-object/from16 v8, p7 */
		 /* invoke-interface/range {v1 ..v8}, Lc/h/n/u;->a(Landroid/view/View;IIIII[I)V */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 17 */
	 /* aget v2, p7, v0 */
	 /* add-int/2addr v2, p4 */
	 /* aput v2, p7, v0 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 18 */
	 /* aget v2, p7, v0 */
	 /* add-int/2addr v2, p5 */
	 /* aput v2, p7, v0 */
	 /* .line 19 */
	 /* instance-of v0, v1, Lc/h/n/t; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 20 */
		 /* move-object v3, v1 */
		 /* check-cast v3, Lc/h/n/t; */
		 /* move-object v4, p1 */
		 /* move v5, p2 */
		 /* move v6, p3 */
		 /* move v7, p4 */
		 /* move v8, p5 */
		 /* move/from16 v9, p6 */
		 /* invoke-interface/range {v3 ..v9}, Lc/h/n/t;->a(Landroid/view/View;IIIII)V */
	 } // :cond_1
	 /* if-nez p6, :cond_3 */
	 /* .line 21 */
	 /* const/16 v2, 0x15 */
	 /* if-lt v0, v2, :cond_2 */
	 /* .line 22 */
	 try { // :try_start_0
		 /* invoke-interface/range {p0 ..p5}, Landroid/view/ViewParent;->onNestedScroll(Landroid/view/View;IIII)V */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* move-object v2, v0 */
		 /* .line 23 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "ViewParent "; // const-string v3, "ViewParent "
		 (( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = " does not implement interface method onNestedScroll"; // const-string v1, " does not implement interface method onNestedScroll"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v1 = "ViewParentCompat"; // const-string v1, "ViewParentCompat"
		 android.util.Log .e ( v1,v0,v2 );
		 /* .line 24 */
	 } // :cond_2
	 /* instance-of v0, v1, Lc/h/n/v; */
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 25 */
		 /* move-object v3, v1 */
		 /* check-cast v3, Lc/h/n/v; */
		 /* move-object v4, p1 */
		 /* move v5, p2 */
		 /* move v6, p3 */
		 /* move v7, p4 */
		 /* move v8, p5 */
		 /* invoke-interface/range {v3 ..v8}, Lc/h/n/v;->onNestedScroll(Landroid/view/View;IIII)V */
	 } // :cond_3
} // :goto_0
return;
} // .end method
public static void a ( android.view.ViewParent p0, android.view.View p1, Integer p2, Integer p3, Integer[] p4, Integer p5 ) {
/* .locals 7 */
/* .line 26 */
/* instance-of v0, p0, Lc/h/n/t; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 27 */
	 /* move-object v1, p0 */
	 /* check-cast v1, Lc/h/n/t; */
	 /* move-object v2, p1 */
	 /* move v3, p2 */
	 /* move v4, p3 */
	 /* move-object v5, p4 */
	 /* move v6, p5 */
	 /* invoke-interface/range {v1 ..v6}, Lc/h/n/t;->a(Landroid/view/View;II[II)V */
} // :cond_0
/* if-nez p5, :cond_2 */
/* .line 28 */
/* const/16 v0, 0x15 */
/* if-lt p5, v0, :cond_1 */
/* .line 29 */
try { // :try_start_0
	 /* :try_end_0 */
	 /* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 30 */
	 /* new-instance p2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String p3 = "ViewParent "; // const-string p3, "ViewParent "
	 (( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 final String p0 = " does not implement interface method onNestedPreScroll"; // const-string p0, " does not implement interface method onNestedPreScroll"
	 (( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String p2 = "ViewParentCompat"; // const-string p2, "ViewParentCompat"
	 android.util.Log .e ( p2,p0,p1 );
	 /* .line 31 */
} // :cond_1
/* instance-of p5, p0, Lc/h/n/v; */
if ( p5 != null) { // if-eqz p5, :cond_2
	 /* .line 32 */
	 /* check-cast p0, Lc/h/n/v; */
} // :cond_2
} // :goto_0
return;
} // .end method
public static void a ( android.view.ViewParent p0, android.view.View p1, android.view.View p2, Integer p3, Integer p4 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p0, Lc/h/n/t; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p0, Lc/h/n/t; */
} // :cond_0
/* if-nez p4, :cond_2 */
/* .line 3 */
/* const/16 v0, 0x15 */
/* if-lt p4, v0, :cond_1 */
/* .line 4 */
try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 5 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "ViewParent "; // const-string p3, "ViewParent "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p0 = " does not implement interface method onNestedScrollAccepted"; // const-string p0, " does not implement interface method onNestedScrollAccepted"
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "ViewParentCompat"; // const-string p2, "ViewParentCompat"
android.util.Log .e ( p2,p0,p1 );
/* .line 6 */
} // :cond_1
/* instance-of p4, p0, Lc/h/n/v; */
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 7 */
/* check-cast p0, Lc/h/n/v; */
} // :cond_2
} // :goto_0
return;
} // .end method
public static Boolean a ( android.view.ViewParent p0, android.view.View p1, Float p2, Float p3 ) {
/* .locals 2 */
/* .line 38 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 39 */
p0 = try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 40 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "ViewParent "; // const-string p3, "ViewParent "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p0 = " does not implement interface method onNestedPreFling"; // const-string p0, " does not implement interface method onNestedPreFling"
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "ViewParentCompat"; // const-string p2, "ViewParentCompat"
android.util.Log .e ( p2,p0,p1 );
/* .line 41 */
} // :cond_0
/* instance-of v0, p0, Lc/h/n/v; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 42 */
p0 = /* check-cast p0, Lc/h/n/v; */
} // :cond_1
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean a ( android.view.ViewParent p0, android.view.View p1, Float p2, Float p3, Boolean p4 ) {
/* .locals 2 */
/* .line 33 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 34 */
p0 = try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 35 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "ViewParent "; // const-string p3, "ViewParent "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p0 = " does not implement interface method onNestedFling"; // const-string p0, " does not implement interface method onNestedFling"
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "ViewParentCompat"; // const-string p2, "ViewParentCompat"
android.util.Log .e ( p2,p0,p1 );
/* .line 36 */
} // :cond_0
/* instance-of v0, p0, Lc/h/n/v; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 37 */
p0 = /* check-cast p0, Lc/h/n/v; */
} // :cond_1
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean b ( android.view.ViewParent p0, android.view.View p1, android.view.View p2, Integer p3, Integer p4 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p0, Lc/h/n/t; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p0 = /* check-cast p0, Lc/h/n/t; */
} // :cond_0
/* if-nez p4, :cond_2 */
/* .line 3 */
/* const/16 v0, 0x15 */
/* if-lt p4, v0, :cond_1 */
/* .line 4 */
p0 = try { // :try_start_0
/* :try_end_0 */
/* .catch Ljava/lang/AbstractMethodError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 5 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "ViewParent "; // const-string p3, "ViewParent "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p0 = " does not implement interface method onStartNestedScroll"; // const-string p0, " does not implement interface method onStartNestedScroll"
(( java.lang.StringBuilder ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "ViewParentCompat"; // const-string p2, "ViewParentCompat"
android.util.Log .e ( p2,p0,p1 );
/* .line 6 */
} // :cond_1
/* instance-of p4, p0, Lc/h/n/v; */
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 7 */
p0 = /* check-cast p0, Lc/h/n/v; */
} // :cond_2
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
