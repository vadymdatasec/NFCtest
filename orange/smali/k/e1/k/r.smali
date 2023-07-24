.class public abstract Lk/e1/k/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk/e1/k/r;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk/e1/k/q;

    invoke-direct {v0}, Lk/e1/k/q;-><init>()V

    sput-object v0, Lk/e1/k/r;->a:Lk/e1/k/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lk/e1/k/e0;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public a(Lk/e1/k/x;)V
    .locals 0

    return-void
.end method
