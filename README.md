# solr
## solr wiki


## solr issue

- SpringBoot Data solrTemplate 调用ADD/DELETE操作不定时会抛出以下异常
```text
Solr goods collection add goodsId is [123456] fail, exception is Timeout occurred while waiting response from server at: http://solrcloud-pro-svc.solrcloud.svc.cluster.local:8983/solr; nested exception is org.apache.solr.client.solrj.SolrServerException: Timeout occurred while waiting response from server at: http://solrcloud-pro-svc.cluster.local:8983/solr
```
- [ ] [solrCloud批量保存索引报错](https://blog.csdn.net/qq_30865917/article/details/83411569)
- [ ] [Commits](https://lucene.apache.org/solr/guide/6_6/updatehandlers-in-solrconfig.html#UpdateHandlersinSolrConfig-autoCommit)
- [ ] [solr soft/hard commit](https://www.cnblogs.com/lzjdm/p/10184118.html)
- [ ] [Understanding the different type of SOLR commits](https://stackoverflow.com/questions/45234145/understanding-the-different-type-of-solr-commits)
- [ ] [Hard Commits, Soft Commits and Transaction Logs](https://lucidworks.com/post/understanding-transaction-logs-softcommit-and-commit-in-sorlcloud/)


```text
 softAutoCommit is like autoCommit except it causes a
         'soft' commit which only ensures that changes are visible
         but does not ensure that data is synced to disk.  This is
         faster and more near-realtime friendly than a hard commit.
         
         
 AutoCommit Perform a hard commit automatically under certain conditions.
         Instead of enabling autoCommit, consider using "commitWithin"
         when adding documents.
         
```