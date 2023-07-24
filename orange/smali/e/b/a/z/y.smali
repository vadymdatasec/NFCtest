.class public Le/b/a/z/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/e0/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/e0/k<",
        "Landroid/net/ConnectivityManager;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Le/b/a/z/k0;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p2, p0, Le/b/a/z/y;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Landroid/net/ConnectivityManager;
    .locals 2

    .line 2
    iget-object v0, p0, Le/b/a/z/y;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/z/y;->get()Landroid/net/ConnectivityManager;

    move-result-object v0

    return-object v0
.end method
