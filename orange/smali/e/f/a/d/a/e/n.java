public abstract class e.f.a.d.a.e.n {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.f.a.d.a.e.a a;
	 /* # direct methods */
	 public static e.f.a.d.a.e.n ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Le/f/a/d/a/e/a; */
		 final String v1 = "PhoneskyVerificationUtils"; // const-string v1, "PhoneskyVerificationUtils"
		 /* invoke-direct {v0, v1}, Le/f/a/d/a/e/a;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 6 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
			 final String v1 = "com.android.vending"; // const-string v1, "com.android.vending"
			 /* const/16 v2, 0x40 */
			 (( android.content.pm.PackageManager ) p0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
			 p0 = this.signatures;
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 if ( p0 != null) { // if-eqz p0, :cond_4
				 /* array-length v1, p0 */
				 if ( v1 != null) { // if-eqz v1, :cond_4
					 int v2 = 0; // const/4 v2, 0x0
				 } // :goto_0
				 /* if-ge v2, v1, :cond_3 */
				 /* aget-object v3, p0, v2 */
				 (( android.content.pm.Signature ) v3 ).toByteArray ( ); // invoke-virtual {v3}, Landroid/content/pm/Signature;->toByteArray()[B
				 e.f.a.d.a.g.a .a ( v3 );
				 final String v4 = "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M"; // const-string v4, "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M"
				 v4 = 				 (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 /* if-nez v4, :cond_2 */
				 v4 = android.os.Build.TAGS;
				 final String v5 = "dev-keys"; // const-string v5, "dev-keys"
				 v4 = 				 (( java.lang.String ) v4 ).contains ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
				 /* if-nez v4, :cond_0 */
				 v4 = android.os.Build.TAGS;
				 final String v5 = "test-keys"; // const-string v5, "test-keys"
				 v4 = 				 (( java.lang.String ) v4 ).contains ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
				 if ( v4 != null) { // if-eqz v4, :cond_1
				 } // :cond_0
				 final String v4 = "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA"; // const-string v4, "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA"
				 v3 = 				 (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 /* if-nez v3, :cond_2 */
			 } // :cond_1
			 /* add-int/lit8 v2, v2, 0x1 */
		 } // :cond_2
		 int p0 = 1; // const/4 p0, 0x1
	 } // :cond_3
} // :cond_4
p0 = e.f.a.d.a.e.n.a;
/* new-array v1, v0, [Ljava/lang/Object; */
final String v2 = "Phonesky package is not signed -- possibly self-built package.Could not verify."; // const-string v2, "Phonesky package is not signed -- possibly self-built package.Could not verify."
(( e.f.a.d.a.e.a ) p0 ).d ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Le/f/a/d/a/e/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V
/* :catch_0 */
} // .end method
