.class public Lm/b/k/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm/b/k/s0;


# instance fields
.field public final a:Lm/b/i/l;

.field public final b:Lm/b/k/f;

.field public final c:Lm/b/k/q0;


# direct methods
.method public constructor <init>(Lm/b/i/l;Lm/b/k/f;Lm/b/k/q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm/b/k/a;->a:Lm/b/i/l;

    .line 3
    iput-object p2, p0, Lm/b/k/a;->b:Lm/b/k/f;

    .line 4
    iput-object p3, p0, Lm/b/k/a;->c:Lm/b/k/q0;

    return-void
.end method


# virtual methods
.method public a(Lm/b/i/t;I)V
    .locals 0

    return-void
.end method

.method public b(Lm/b/i/t;I)V
    .locals 1

    .line 1
    instance-of p2, p1, Lm/b/i/l;

    if-eqz p2, :cond_0

    .line 2
    check-cast p1, Lm/b/i/l;

    .line 3
    iget-object p2, p0, Lm/b/k/a;->c:Lm/b/k/q0;

    iget-object v0, p0, Lm/b/k/a;->a:Lm/b/i/l;

    invoke-virtual {p2, v0, p1}, Lm/b/k/q0;->a(Lm/b/i/l;Lm/b/i/l;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    iget-object p2, p0, Lm/b/k/a;->b:Lm/b/k/f;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
