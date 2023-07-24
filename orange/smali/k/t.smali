.class public interface abstract Lk/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk/s;

    invoke-direct {v0}, Lk/s;-><init>()V

    sput-object v0, Lk/t;->a:Lk/t;

    return-void
.end method


# virtual methods
.method public abstract a(Lk/f0;)Ljava/util/List;
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
.end method

.method public abstract a(Lk/f0;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk/f0;",
            "Ljava/util/List<",
            "Lk/r;",
            ">;)V"
        }
    .end annotation
.end method
