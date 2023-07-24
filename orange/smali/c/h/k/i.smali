.class public Lc/h/k/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/m/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/h/m/a<",
        "Lc/h/k/l;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lc/h/k/c;


# direct methods
.method public constructor <init>(Lc/h/k/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/h/k/i;->a:Lc/h/k/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/h/k/l;)V
    .locals 1

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lc/h/k/l;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, Lc/h/k/l;-><init>(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lc/h/k/i;->a:Lc/h/k/c;

    invoke-virtual {v0, p1}, Lc/h/k/c;->a(Lc/h/k/l;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lc/h/k/l;

    invoke-virtual {p0, p1}, Lc/h/k/i;->a(Lc/h/k/l;)V

    return-void
.end method
