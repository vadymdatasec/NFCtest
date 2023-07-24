.class public interface abstract Lk/e1/k/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk/e1/k/j0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk/e1/k/i0;

    invoke-direct {v0}, Lk/e1/k/i0;-><init>()V

    sput-object v0, Lk/e1/k/j0;->a:Lk/e1/k/j0;

    return-void
.end method


# virtual methods
.method public abstract a(ILk/e1/k/a;)V
.end method

.method public abstract a(ILjava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lk/e1/k/c;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract a(ILjava/util/List;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lk/e1/k/c;",
            ">;Z)Z"
        }
    .end annotation
.end method

.method public abstract a(ILl/h;IZ)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
