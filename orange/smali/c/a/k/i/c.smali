.class public final Lc/a/k/i/c;
.super Lc/a/k/i/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/k/i/a<",
        "Landroid/content/Intent;",
        "Lc/a/k/b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/a/k/i/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/content/Intent;)Lc/a/k/b;
    .locals 1

    .line 2
    new-instance v0, Lc/a/k/b;

    invoke-direct {v0, p1, p2}, Lc/a/k/b;-><init>(ILandroid/content/Intent;)V

    return-object v0
.end method

.method public bridge synthetic a(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lc/a/k/i/c;->a(ILandroid/content/Intent;)Lc/a/k/b;

    move-result-object p1

    return-object p1
.end method
