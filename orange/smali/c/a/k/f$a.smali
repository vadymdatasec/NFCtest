.class public Lc/a/k/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/k/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lc/a/k/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/k/c<",
            "TO;>;"
        }
    .end annotation
.end field

.field public final b:Lc/a/k/i/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/k/i/a<",
            "*TO;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/a/k/c;Lc/a/k/i/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/k/c<",
            "TO;>;",
            "Lc/a/k/i/a<",
            "*TO;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/a/k/f$a;->a:Lc/a/k/c;

    .line 3
    iput-object p2, p0, Lc/a/k/f$a;->b:Lc/a/k/i/a;

    return-void
.end method
