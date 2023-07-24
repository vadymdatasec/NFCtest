.class public Le/h/d/a/a/n/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/a/a/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/a/a/u<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public b:Landroid/net/Uri;

.field public final synthetic c:Le/h/d/a/a/n/m;


# direct methods
.method public constructor <init>(Le/h/d/a/a/n/m;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/h/d/a/a/n/k;->c:Le/h/d/a/a/n/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Le/h/d/a/a/n/k;->a:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 0

    .line 4
    iput-object p1, p0, Le/h/d/a/a/n/k;->b:Landroid/net/Uri;

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 3
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Le/h/d/a/a/n/k;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/n/k;->c:Le/h/d/a/a/n/m;

    iget-object v1, p0, Le/h/d/a/a/n/k;->b:Landroid/net/Uri;

    if-nez v1, :cond_0

    iget-object v1, p0, Le/h/d/a/a/n/k;->a:Landroid/net/Uri;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Le/h/d/a/a/n/k;->b:Landroid/net/Uri;

    :goto_0
    invoke-virtual {v0, v1, p1}, Le/h/d/a/a/n/m;->a(Landroid/net/Uri;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 2
    iget-object v0, p0, Le/h/d/a/a/n/k;->c:Le/h/d/a/a/n/m;

    invoke-virtual {v0, p1}, Le/h/d/a/a/n/m;->a(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
