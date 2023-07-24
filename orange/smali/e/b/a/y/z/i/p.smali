.class public abstract Le/b/a/y/z/i/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/b/a/y/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/q<",
            "Le/b/a/y/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Le/b/a/y/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/q<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Le/b/a/y/b;->d:Le/b/a/y/b;

    const-string v1, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    .line 2
    invoke-static {v1, v0}, Le/b/a/y/q;->a(Ljava/lang/String;Ljava/lang/Object;)Le/b/a/y/q;

    move-result-object v0

    sput-object v0, Le/b/a/y/z/i/p;->a:Le/b/a/y/q;

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    invoke-static {v1, v0}, Le/b/a/y/q;->a(Ljava/lang/String;Ljava/lang/Object;)Le/b/a/y/q;

    move-result-object v0

    sput-object v0, Le/b/a/y/z/i/p;->b:Le/b/a/y/q;

    return-void
.end method
