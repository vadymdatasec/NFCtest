.class public Le/h/d/a/a/n/l;
.super Le/a/a/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0x7530

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    .line 1
    invoke-direct {p0, v0, v1, v2}, Le/a/a/e;-><init>(IIF)V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/VolleyError;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/android/volley/VolleyError;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p1, Lcom/android/volley/VolleyError;->b:Le/a/a/l;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    throw p1

    .line 3
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Le/a/a/e;->a(Lcom/android/volley/VolleyError;)V

    return-void
.end method
