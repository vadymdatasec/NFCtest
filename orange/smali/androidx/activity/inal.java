public class inal implements c.n.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static Integer b;
	 public static java.lang.reflect.Field c;
	 public static java.lang.reflect.Field d;
	 public static java.lang.reflect.Field e;
	 /* # instance fields */
	 public android.app.Activity a;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static void a ( ) {
		 /* .locals 3 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* .line 20 */
		 try { // :try_start_0
			 /* .line 21 */
			 /* const-class v0, Landroid/view/inputmethod/InputMethodManager; */
			 final String v1 = "mServedView"; // const-string v1, "mServedView"
			 (( java.lang.Class ) v0 ).getDeclaredField ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 int v1 = 1; // const/4 v1, 0x1
			 /* .line 22 */
			 (( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
			 /* .line 23 */
			 /* const-class v0, Landroid/view/inputmethod/InputMethodManager; */
			 final String v2 = "mNextServedView"; // const-string v2, "mNextServedView"
			 (( java.lang.Class ) v0 ).getDeclaredField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 24 */
			 (( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
			 /* .line 25 */
			 /* const-class v0, Landroid/view/inputmethod/InputMethodManager; */
			 final String v2 = "mH"; // const-string v2, "mH"
			 (( java.lang.Class ) v0 ).getDeclaredField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 26 */
			 (( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
			 /* .line 27 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 return;
		 } // .end method
		 /* # virtual methods */
		 public void a ( Object p0, c.n.g$a p1 ) {
			 /* .locals 2 */
			 /* .line 1 */
			 p1 = c.n.g$a.ON_DESTROY;
			 /* if-eq p2, p1, :cond_0 */
			 return;
			 /* .line 2 */
		 } // :cond_0
		 /* if-nez p1, :cond_1 */
		 /* .line 3 */
		 androidx.activity.ImmLeaksCleaner .a ( );
		 /* .line 4 */
	 } // :cond_1
	 int p2 = 1; // const/4 p2, 0x1
	 /* if-ne p1, p2, :cond_5 */
	 /* .line 5 */
	 p1 = this.a;
	 final String p2 = "input_method"; // const-string p2, "input_method"
	 /* .line 6 */
	 (( android.app.Activity ) p1 ).getSystemService ( p2 ); // invoke-virtual {p1, p2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast p1, Landroid/view/inputmethod/InputMethodManager; */
	 /* .line 7 */
	 try { // :try_start_0
		 p2 = androidx.activity.ImmLeaksCleaner.c;
		 (( java.lang.reflect.Field ) p2 ).get ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_3 */
		 /* if-nez p2, :cond_2 */
		 return;
		 /* .line 8 */
	 } // :cond_2
	 /* monitor-enter p2 */
	 /* .line 9 */
	 try { // :try_start_1
		 v0 = androidx.activity.ImmLeaksCleaner.d;
		 (( java.lang.reflect.Field ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/View; */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_2 */
		 /* .catch Ljava/lang/ClassCastException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* if-nez v0, :cond_3 */
		 /* .line 10 */
		 try { // :try_start_2
			 /* monitor-exit p2 */
			 return;
			 /* .line 11 */
		 } // :cond_3
		 v0 = 		 (( android.view.View ) v0 ).isAttachedToWindow ( ); // invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 /* .line 12 */
			 /* monitor-exit p2 */
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 return;
			 /* .line 13 */
		 } // :cond_4
		 try { // :try_start_3
			 v0 = androidx.activity.ImmLeaksCleaner.e;
			 int v1 = 0; // const/4 v1, 0x0
			 (( java.lang.reflect.Field ) v0 ).set ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
			 /* :try_end_3 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_3 ..:try_end_3} :catch_0 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
			 /* .line 14 */
			 try { // :try_start_4
				 /* monitor-exit p2 */
				 /* :try_end_4 */
				 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
				 /* .line 15 */
				 (( android.view.inputmethod.InputMethodManager ) p1 ).isActive ( ); // invoke-virtual {p1}, Landroid/view/inputmethod/InputMethodManager;->isActive()Z
				 /* .line 16 */
				 /* :catch_0 */
				 try { // :try_start_5
					 /* monitor-exit p2 */
					 return;
					 /* :catchall_0 */
					 /* move-exception p1 */
					 /* .line 17 */
					 /* :catch_1 */
					 /* monitor-exit p2 */
					 return;
					 /* .line 18 */
					 /* :catch_2 */
					 /* monitor-exit p2 */
					 return;
					 /* .line 19 */
				 } // :goto_0
				 /* monitor-exit p2 */
				 /* :try_end_5 */
				 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
				 /* throw p1 */
				 /* :catch_3 */
			 } // :cond_5
		 } // :goto_1
		 return;
	 } // .end method
