#include<bits/stdc++.h>
void dfs(stack<int> &st, vector<int> &disc, vector<int> &low, vector<int> &vis, vector<vector<int>> &ans, vector<int> adj[], int &t, int u)
    {
        disc[u] = low[u] = t++;
        vis[u] = 1;
        st.push(u);
        for (auto v : adj[u])
        {
            if (disc[v] == -1)
            {
                dfs(st, disc, low, vis, ans, adj, t, v);
                low[u] = min(low[u], low[v]);
            }
            else if (vis[v] == 1)
            {
                low[u] = min(low[u], disc[v]);
            }
        }
        if (low[u] == disc[u])
        {
            vector<int> k;
            while (!st.empty() && st.top() != u)
            {
                k.push_back(st.top());
                vis[st.top()] = 0;
                st.pop();
            }
            if (!st.empty())
            {
                k.push_back(st.top());
                vis[st.top()] = 0;
                st.pop();
            }
            sort(k.begin(), k.end());
            ans.push_back(k);
        }
}
vector<vector<int>> stronglyConnectedComponents(int n, vector<vector<int>> &edges)
{
    // Write your code here.
    vector<int>adj[n];
    for(auto&x:edges){
        adj[x[0]].push_back(x[1]);
    }
    vector<int>disc(n,-1);
    vector<int>low(n,-1);
    vector<int>vis(n,0);
    stack<int>st;
    vector<vector<int>>ans;
    int t=0;
    for(int i=0;i<n;i++){
        if(disc[i]==-1)dfs(st,disc,low,vis,ans,adj,t,i);
    }
    sort(ans.begin(),ans.end());
    return ans;
}
