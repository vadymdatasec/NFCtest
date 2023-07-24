.class public Lc/h/k/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lc/h/k/l;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lc/h/k/g;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lc/h/k/g;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/h/k/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lc/h/k/j;->b:Landroid/content/Context;

    iput-object p3, p0, Lc/h/k/j;->c:Lc/h/k/g;

    iput p4, p0, Lc/h/k/j;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Lc/h/k/l;
    .locals 4

    .line 2
    :try_start_0
    iget-object v0, p0, Lc/h/k/j;->a:Ljava/lang/String;

    iget-object v1, p0, Lc/h/k/j;->b:Landroid/content/Context;

    iget-object v2, p0, Lc/h/k/j;->c:Lc/h/k/g;

    iget v3, p0, Lc/h/k/j;->d:I

    invoke-static {v0, v1, v2, v3}, Lc/h/k/m;->a(Ljava/lang/String;Landroid/content/Context;Lc/h/k/g;I)Lc/h/k/l;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 3
    :catchall_0
    new-instance v0, Lc/h/k/l;

    const/4 v1, -0x3

    invoke-direct {v0, v1}, Lc/h/k/l;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/h/k/j;->call()Lc/h/k/l;

    move-result-object v0

    return-object v0
.end method
