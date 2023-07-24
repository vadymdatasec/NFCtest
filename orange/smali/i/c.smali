.class public final Li/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li/c;

    invoke-direct {v0}, Li/c;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Li/b;
    .locals 4

    .line 1
    new-instance v0, Li/b;

    const/4 v1, 0x1

    const/4 v2, 0x5

    const/16 v3, 0x1f

    invoke-direct {v0, v1, v2, v3}, Li/b;-><init>(III)V

    return-object v0
.end method
