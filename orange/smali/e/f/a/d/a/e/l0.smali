.class public abstract Le/f/a/d/a/e/l0;
.super Le/f/a/d/a/e/d0;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/m0;


# direct methods
.method public static a(Landroid/os/IBinder;)Le/f/a/d/a/e/m0;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Le/f/a/d/a/e/m0;

    if-eqz v1, :cond_1

    check-cast v0, Le/f/a/d/a/e/m0;

    return-object v0

    :cond_1
    new-instance v0, Le/f/a/d/a/e/k0;

    invoke-direct {v0, p0}, Le/f/a/d/a/e/k0;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
