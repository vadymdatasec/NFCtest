.class public Lm/b/i/q;
.super Lm/b/i/l;
.source "SourceFile"


# instance fields
.field public final i:Lm/b/k/f;


# direct methods
.method public constructor <init>(Lm/b/j/g0;Ljava/lang/String;Lm/b/i/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;Lm/b/i/b;)V

    .line 2
    new-instance p1, Lm/b/k/f;

    invoke-direct {p1}, Lm/b/k/f;-><init>()V

    iput-object p1, p0, Lm/b/i/q;->i:Lm/b/k/f;

    return-void
.end method


# virtual methods
.method public b(Lm/b/i/l;)Lm/b/i/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/i/q;->i:Lm/b/k/f;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
