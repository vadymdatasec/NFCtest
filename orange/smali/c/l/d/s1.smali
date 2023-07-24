.class public Lc/l/d/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/n/w$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lc/n/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lc/n/v;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    new-instance p1, Lc/l/d/t1;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lc/l/d/t1;-><init>(Z)V

    return-object p1
.end method
