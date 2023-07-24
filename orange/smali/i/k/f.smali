.class public final Li/k/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Li/h/c/q/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "TT;>;",
        "Li/h/c/q/a;"
    }
.end annotation


# instance fields
.field public final synthetic b:Li/k/a;


# direct methods
.method public constructor <init>(Li/k/a;)V
    .locals 0

    iput-object p1, p0, Li/k/f;->b:Li/k/a;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Li/k/f;->b:Li/k/a;

    invoke-interface {v0}, Li/k/a;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
