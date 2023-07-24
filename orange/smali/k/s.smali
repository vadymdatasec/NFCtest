.class public Lk/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lk/f0;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk/f0;",
            ")",
            "Ljava/util/List<",
            "Lk/r;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a(Lk/f0;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk/f0;",
            "Ljava/util/List<",
            "Lk/r;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
