.class public abstract Le/f/a/d/a/a/m;
.super Le/f/a/d/a/e/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/a/d/a/e/i0;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/e/a;

.field public final b:Le/f/a/d/a/i/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/i/o<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic c:Le/f/a/d/a/a/o;


# direct methods
.method public constructor <init>(Le/f/a/d/a/a/o;Le/f/a/d/a/e/a;Le/f/a/d/a/i/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/e/a;",
            "Le/f/a/d/a/i/o<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Le/f/a/d/a/a/m;->c:Le/f/a/d/a/a/o;

    invoke-direct {p0}, Le/f/a/d/a/e/i0;-><init>()V

    iput-object p2, p0, Le/f/a/d/a/a/m;->a:Le/f/a/d/a/e/a;

    iput-object p3, p0, Le/f/a/d/a/a/m;->b:Le/f/a/d/a/i/o;

    return-void
.end method


# virtual methods
.method public d(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Le/f/a/d/a/a/m;->c:Le/f/a/d/a/a/o;

    iget-object p1, p1, Le/f/a/d/a/a/o;->a:Le/f/a/d/a/e/k;

    invoke-virtual {p1}, Le/f/a/d/a/e/k;->a()V

    iget-object p1, p0, Le/f/a/d/a/a/m;->a:Le/f/a/d/a/e/a;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onCompleteUpdate"

    invoke-virtual {p1, v1, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Le/f/a/d/a/a/m;->c:Le/f/a/d/a/a/o;

    iget-object p1, p1, Le/f/a/d/a/a/o;->a:Le/f/a/d/a/e/k;

    invoke-virtual {p1}, Le/f/a/d/a/e/k;->a()V

    iget-object p1, p0, Le/f/a/d/a/a/m;->a:Le/f/a/d/a/e/a;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onRequestInfo"

    invoke-virtual {p1, v1, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
