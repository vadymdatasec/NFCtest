.class public Le/b/a/y/y/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "Ljava/lang/Integer;",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/j1;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/g1;",
            ")",
            "Le/b/a/y/y/w0<",
            "Ljava/lang/Integer;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Le/b/a/y/y/k1;

    iget-object v0, p0, Le/b/a/y/y/j1;->a:Landroid/content/res/Resources;

    invoke-static {}, Le/b/a/y/y/v1;->a()Le/b/a/y/y/v1;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Le/b/a/y/y/k1;-><init>(Landroid/content/res/Resources;Le/b/a/y/y/w0;)V

    return-object p1
.end method
